/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.DAO;
import entitys.QualityRating;
import java.util.List;

/**
 *
 * @author anekr
 */
public class QualityRatingService extends Service<QualityRating>{
    
    public QualityRatingService(DAO dao) {
        super(dao);
    }

    @Override
    public DAO dao() {
        return super.dao(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Class<QualityRating> type, Integer id) {
        super.delete(type, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QualityRating> findAll(Class<QualityRating> type) {
        return super.findAll(type); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public QualityRating findById(Class<QualityRating> type, Integer id) {
        return super.findById(type, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(QualityRating entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(QualityRating entity) {
        super.add(entity); //To change body of generated methods, choose Tools | Templates.
    }

    
}
