/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.DAO;
import entitys.Apartment;
import java.util.List;

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
    public void delete(Class<Apartment> type, Integer id) {
        super.delete(type, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Apartment> findAll(Class<Apartment> type) {
        return super.findAll(type); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Apartment findById(Class<Apartment> type, Integer id) {
        return super.findById(type, id); //To change body of generated methods, choose Tools | Templates.
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
