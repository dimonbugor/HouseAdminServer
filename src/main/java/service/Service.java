package service;

import dao.DAO;
import java.util.List;

public class Service<T> {

    private final DAO dao;

    public Service(DAO dao) {
        this.dao = dao;
    }

    //создать
    public void add(T entity) {
        dao.openSessionwithTransaction();
        dao.add(entity);
        dao.closeSessionwithTransaction();
    }

    //обновить
    public void update(T entity) {
        dao.openSessionwithTransaction();
        dao.update(entity);
        dao.closeSessionwithTransaction();
    }

    //найти по id
    public T findById(Class<T> type, Integer id) {
        dao.openSession();
        T t = (T) dao.findById(type, id);
        dao.closeSession();
        return t;
    }

    //найти все
    public List<T> findAll(Class<T> type){
        dao.openSession();
        List<T> tList = dao.findAll(type);
        dao.closeSession();
        return tList;
    }

    //удалить
    public void delete(Class<T> type, Integer id) {
        dao.openSessionwithTransaction();
        T t = (T) dao.findById(type, id);
        dao.delete(t);
        dao.closeSessionwithTransaction();
    }
    
    public DAO dao(){
        return dao;
    }
}
