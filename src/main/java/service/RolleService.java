/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.DAO;
import entitys.Rolle;
import java.util.List;

/**
 *
 * @author anekr
 */
public class RolleService extends Service<Rolle>{
    
    public RolleService(DAO dao) {
        super(dao);
    }

    @Override
    public DAO dao() {
        return super.dao(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Class<Rolle> type, Integer id) {
        super.delete(type, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rolle> findAll(Class<Rolle> type) {
        return super.findAll(type); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rolle findById(Class<Rolle> type, Integer id) {
        return super.findById(type, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Rolle entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Rolle entity) {
        super.add(entity); //To change body of generated methods, choose Tools | Templates.
    }

    
}
