/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.DAO;
import entitys.AvailablityRating;
import java.util.List;

/**
 *
 * @author anekr
 */
public class AvailablityRatingService extends Service<AvailablityRating>{
    
    public AvailablityRatingService(DAO dao) {
        super(dao);
    }

    @Override
    public DAO dao() {
        return super.dao(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Class<AvailablityRating> type, Integer id) {
        super.delete(type, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AvailablityRating> findAll(Class<AvailablityRating> type) {
        return super.findAll(type); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AvailablityRating findById(Class<AvailablityRating> type, Integer id) {
        return super.findById(type, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(AvailablityRating entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(AvailablityRating entity) {
        super.add(entity); //To change body of generated methods, choose Tools | Templates.
    }

    
}
