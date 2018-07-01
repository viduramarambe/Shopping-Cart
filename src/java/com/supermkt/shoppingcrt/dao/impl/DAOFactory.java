/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.dao.impl;

import com.supermkt.shoppingcrt.dao.CustomerDAO;
import com.supermkt.shoppingcrt.dao.ItemCategoryDAO;
import com.supermkt.shoppingcrt.dao.ItemDAO;
import com.supermkt.shoppingcrt.dao.OwnerDAO;

/**
 *
 * @author Vidura Marambe
 */
public class DAOFactory {
    
    public CustomerDAO getCustomerDAO(){
        return new CustomerDAOImpl();
    }
    
    public ItemCategoryDAO getItemCategoryDAO(){
        return new ItemCategoryDAOImpl();
    }
    
    public ItemDAO getItemDAO(){
        return new ItemDAOImpl();
    }
    
    public OwnerDAO getOwnerDAO(){
        return new OwnerDAOImpl();
    }
}
