/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entitys.Payments;
import java.util.List;

/**
 *
 * @author anekr
 */
public class PaymentsDAO extends DAO<Payments>{

    @Override
    public void delete(Payments entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Payments> findAll(Class<Payments> type) {
        return super.findAll(type); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Payments findById(Class<Payments> type, int id) {
        return super.findById(type, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Payments entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Payments entity) {
        super.add(entity); //To change body of generated methods, choose Tools | Templates.
    }

        
}
