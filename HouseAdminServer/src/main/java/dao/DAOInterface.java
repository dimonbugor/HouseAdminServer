/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author anekr
 * @param <T>
 */
public interface DAOInterface<T> {
    
    //создать
    public void add(T entity);
    //обновить
    public void update(T entity);
    //найти по id
    public T findById(int id);
    //найти все
    public List<T> findAll();
    //удалить
    public void delete(T entity);
    //удалить все
    public void deleteAll();
}
