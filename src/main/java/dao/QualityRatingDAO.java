/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entitys.QualityRating;
import java.util.List;

/**
 *
 * @author anekr
 */
public class QualityRatingDAO extends DAO<QualityRating>{

    @Override
    public void delete(QualityRating entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<QualityRating> findAll(Class<QualityRating> type) {
        return super.findAll(type); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public QualityRating findById(Class<QualityRating> type, int id) {
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
