/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.DAO;
import entitys.User;
import java.util.List;

/**
 *
 * @author anekr
 */
public class UserService extends Service<User>{
    
    public UserService(DAO dao) {
        super(dao);
    }

    @Override
    public DAO dao() {
        return super.dao(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Class<User> type, Integer id) {
        super.delete(type, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findAll(Class<User> type) {
        return super.findAll(type); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findById(Class<User> type, Integer id) {
        return super.findById(type, id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(User entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(User entity) {
        super.add(entity); //To change body of generated methods, choose Tools | Templates.
    }

    
}
