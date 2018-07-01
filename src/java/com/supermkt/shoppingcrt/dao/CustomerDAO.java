/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.dao;

import com.supermkt.shoppingcrt.model.CustomerModel;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Vidura Marambe
 */
public interface CustomerDAO {
    public int insert(CustomerModel customerModel) throws ClassNotFoundException,SQLException;
    public List<CustomerModel> readAll() throws ClassNotFoundException,SQLException;
    public int update(CustomerModel customerModel) throws ClassNotFoundException,SQLException;
    public int delete(CustomerModel customerModel) throws ClassNotFoundException,SQLException;
}
