/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.DAO;
import entitys.Apartment;
import entitys.Payments;
import entitys.User;
import static hibernate.HibernateUtil.getSessionFactory;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author anekr
 */
public class PaymentsService extends Service<Payments>{
    
    public PaymentsService(DAO dao) {
        super(dao);
    }

    @Override
    public DAO dao() {
        return super.dao(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAll() {
        super.deleteAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer id) {
        super.delete(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Payments> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Payments findById(Integer id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Payments entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Payments entity) {
        super.add(entity); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Payments> findAllByApartment(Apartment apartment) {
        Session session = getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.getNamedQuery("Payments.findByApartmentTableId");
        query.setParameter("apartmentTableId", apartment.getId());
        List<Payments> pays = query.list();
        tx.commit();
        session.close();
        return pays;
    }

    
}
