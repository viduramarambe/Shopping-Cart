/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.service.impl;

import com.supermkt.shoppingcrt.service.CustomerService;
import com.supermkt.shoppingcrt.service.ItemCategoryService;
import com.supermkt.shoppingcrt.service.ItemService;
import com.supermkt.shoppingcrt.service.OwnerService;

/**
 *
 * @author Vidura Marambe
 */
public class ServiceFactory {
    
    public CustomerService getCustomerService(){
        return new CustomerServiceImpl();
    }
    
    public ItemService getItemService(){
        return new ItemServiceImpl();
    }
    
    public OwnerService getOwnerService(){
        return new OwnerServiceImpl();
    }
    
    public ItemCategoryService getItemCategoryService(){
        return new ItemCategoryServiceImpl();
    }
}
