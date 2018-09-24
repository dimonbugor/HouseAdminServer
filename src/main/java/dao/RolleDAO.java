/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entitys.Rolle;
import java.util.List;

/**
 *
 * @author anekr
 */
public class RolleDAO extends DAO<Rolle>{

    @Override
    public void delete(Rolle entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rolle> findAll(Class<Rolle> type) {
        return super.findAll(type); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rolle findById(Class<Rolle> type, int id) {
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
