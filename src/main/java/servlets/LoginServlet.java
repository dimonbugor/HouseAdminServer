/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import entitys.User;
import static hibernate.HibernateUtil.getSessionFactory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author anekr
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        log(email);
        log(password);
        //UserService userService = new UserService(new UserDAO());
        //List<User> listUsers = userService.findAll();
        Session session = getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.getNamedQuery("User.findByEmail");
        query.setParameter("email", email);
        User user;
        user = (User) query.uniqueResult();
        tx.commit();
        session.close();
        
        if(user == null){
            user = new User();
            user.setEmail("false");
            user.setPassword("false");
            String jsonUsers = new ObjectMapper().writeValueAsString(user);
            response.setContentType("application/json;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println(jsonUsers);
            }
        } else if (user.getPassword().equals(password)) {
            String jsonUsers = new ObjectMapper().writeValueAsString(user);
            response.setContentType("application/json;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println(jsonUsers);
            }
        } else{
            user.setPassword("false");
            String jsonUsers = new ObjectMapper().writeValueAsString(user);
            response.setContentType("application/json;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println(jsonUsers);
            }
        }

        //processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
