/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import entitys.Apartment;
import entitys.Payments;
import entitys.User;
import static hibernate.HibernateUtil.getSessionFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.sql.JoinType;

/**
 *
 * @author anekr
 */
public class AllApartamentShowServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //должен выдать JSON с полным списком квартир и последней оплатой по квартире
        //добавим список мар для подальшего его преобразования в JSON
        Map<Apartment, Payments> AllApartmentMap = new HashMap<>();
        //получаем список квартир
        Session session = getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Apartment.class);
        List<Apartment> apartmentList = criteria.list();
        String jsonUsers = new ObjectMapper().writeValueAsString(apartmentList);
        session.close();

        /*for (Apartment apartment : apartmentList) {
            Payments pay;
            try {
                session = getSessionFactory().openSession();
                tx = session.beginTransaction();
                query = session.getNamedQuery("Payments.findByApartmentTableId");
                query.setParameter("apartmentTableId", apartment.getId());
                pay = (Payments) query.uniqueResult();
                tx.commit();
                session.close();
            } catch (NullPointerException npe) {
                pay = null;
            }

            AllApartmentMap.put(apartment, pay);

        }*/
        //String jsonUsers = new ObjectMapper().writeValueAsString(apartmentList);
        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println(jsonUsers);
        }
        //processRequest(request, response);
    }

}
