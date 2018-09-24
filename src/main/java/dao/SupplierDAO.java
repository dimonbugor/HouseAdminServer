/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entitys.Supplier;
import java.util.List;

/**
 *
 * @author anekr
 */
public class SupplierDAO extends DAO<Supplier>{

    @Override
    public void delete(Supplier entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Supplier> findAll(Class<Supplier> type) {
        return super.findAll(type); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Supplier findById(Class<Supplier> type, int id) {
        return super.findById(type, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Supplier entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Supplier entity) {
        super.add(entity); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
