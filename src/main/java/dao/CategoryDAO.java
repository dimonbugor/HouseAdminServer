/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entitys.Category;
import java.util.List;

/**
 *
 * @author anekr
 */
public class CategoryDAO extends DAO<Category>{

    @Override
    public void delete(Category entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Category> findAll(Class<Category> type) {
        return super.findAll(type); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Category findById(Class<Category> type, int id) {
        return super.findById(type, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Category entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Category entity) {
        super.add(entity); //To change body of generated methods, choose Tools | Templates.
    }

        
}
