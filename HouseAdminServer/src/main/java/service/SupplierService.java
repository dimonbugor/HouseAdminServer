/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.DAO;
import entitys.Supplier;

/**
 *
 * @author anekr
 */
public class SupplierService extends Service<Supplier>{
    
    public SupplierService(DAO dao) {
        super(dao);
    }
    
}
