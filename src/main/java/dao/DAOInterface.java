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
    public void add(final T entity);
    //обновить
    public void update(final T entity);
    //найти по id
    public T findById(final Class<T> type, final int id);
    //найти все
    public List<T> findAll(final Class <T> type);
    //удалить
    public void delete(final T entity);
}
