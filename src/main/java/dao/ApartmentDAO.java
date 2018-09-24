/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entitys.Apartment;
import java.util.List;
/**
 *
 * @author anekr
 */
public class ApartmentDAO extends DAO<Apartment>{

    @Override
    public void delete(Apartment entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Apartment findById(Class<Apartment> type, int id) {
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

    @Override
    public List<Apartment> findAll(Class<Apartment> type) {
        return super.findAll(type); //To change body of generated methods, choose Tools | Templates.
    }

}
