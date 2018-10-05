/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.DAO;
import entitys.Apartment;
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
public class ApartmentService extends Service<Apartment>{
    
    public ApartmentService(DAO dao) {
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
    public List<Apartment> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Apartment> findAllCriteria() {
        Session session = getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.getNamedQuery("Apartment.findAll");
        List<Apartment> aparts = query.list();
        tx.commit();
        session.close();
        return aparts;
    }

    @Override
    public Apartment findById(Integer id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Apartment entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Apartment entity) {
        super.add(entity); //To change body of generated methods, choose Tools | Templates.
    }

    
}
