/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.dao.impl;

import com.supermkt.shoppingcrt.conn.ResourceConnection;
import com.supermkt.shoppingcrt.conn.ResourceConnectionFactory;
import com.supermkt.shoppingcrt.dao.CustomerDAO;
import com.supermkt.shoppingcrt.model.CustomerModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vidura Marambe
 */
public class CustomerDAOImpl implements CustomerDAO{

    ResourceConnection resourceConnection=new ResourceConnectionFactory().getConnection();
    
    @Override
    public int insert(CustomerModel customerModel) throws ClassNotFoundException, SQLException {
        int res=-1;
        try {
            Statement stm=resourceConnection.getConnection().createStatement();
            //res = stm.executeUpdate("INSERT INTO Customer VALUES('" + customerModel.getCustomerId() + "','" + customerModel.getUserName() + "','" + customerModel.getPassword()+ "','" +customerModel.getMobile() + "')");
            res = stm.executeUpdate("INSERT INTO Customer VALUES('" + customerModel.getCustomerId() + "',AES_ENCRYPT('" + customerModel.getUserName() +"','1'),AES_ENCRYPT('" + customerModel.getPassword()+ "','1'),'" +customerModel.getMobile() + "')");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return res;
    }

    @Override
    public List<CustomerModel> readAll() throws ClassNotFoundException, SQLException {
        ArrayList<CustomerModel> custlist=null;
        try {
            String SQL = "Select customerID,AES_DECRYPT(username,'1'),AES_DECRYPT(password,'1'),mobile from customer";
            Connection con = resourceConnection.getConnection();
            Statement stm = con.createStatement();
            ResultSet rst = stm.executeQuery(SQL);
            custlist = new ArrayList<>();
            while (rst.next()) {
                CustomerModel c1 = new CustomerModel();
                c1.setCustomerId(rst.getString("CUSTOMERID"));
                c1.setUserName(rst.getString("AES_DECRYPT(USERNAME,'1')"));
                c1.setPassword(rst.getString("AES_DECRYPT(PASSWORD,'1')"));
                c1.setMobile(rst.getString("MOBILE"));
                custlist.add(c1);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return custlist;
    }

    @Override
    public int update(CustomerModel customerModel) throws ClassNotFoundException, SQLException {
        int res=-1;
        try {
            Connection con = resourceConnection.getConnection();
            Statement stm = con.createStatement();
            res = stm.executeUpdate("Update Customer set USERNAME=AES_ENCRYPT('" + customerModel.getUserName() +"','1'),PASSWORD=AES_ENCRYPT('" + customerModel.getPassword()+ "','1'), MOBILE='" +customerModel.getMobile()+ "' where CUSTOMERID='" + customerModel.getCustomerId() + "'");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return res;
    }

    @Override
    public int delete(CustomerModel customerModel) throws ClassNotFoundException, SQLException {
        int res=-1;
        try {
            Connection con = resourceConnection.getConnection();
            Statement stm = con.createStatement();
            res= stm.executeUpdate("Delete From Customer where CUSTOMERID='" + customerModel.getCustomerId() + "'");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return res;
    }
    
}
