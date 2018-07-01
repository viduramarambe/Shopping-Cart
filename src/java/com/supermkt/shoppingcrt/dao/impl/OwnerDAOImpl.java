/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.dao.impl;

import com.supermkt.shoppingcrt.conn.ResourceConnection;
import com.supermkt.shoppingcrt.conn.ResourceConnectionFactory;
import com.supermkt.shoppingcrt.dao.OwnerDAO;
import com.supermkt.shoppingcrt.model.ItemModel;
import com.supermkt.shoppingcrt.model.OwnerModel;
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
public class OwnerDAOImpl implements OwnerDAO{
    
    ResourceConnection resourceConnection=new ResourceConnectionFactory().getConnection();

    @Override
    public List<OwnerModel> read() throws ClassNotFoundException, SQLException {
        ArrayList<OwnerModel> Owner=null;
        try {
            String SQL = "Select ownerId,AES_DECRYPT(username,'1'),AES_DECRYPT(password,'1') from owner";
            Connection con = resourceConnection.getConnection();
            Statement stm = con.createStatement();
            ResultSet rst = stm.executeQuery(SQL);
            Owner = new ArrayList<>();
            while (rst.next()) {
                OwnerModel o1 = new OwnerModel();
                o1.setOwnerId(rst.getString("OWNERID"));
                o1.setUserName(rst.getString("AES_DECRYPT(USERNAME,'1')"));
                o1.setPassword(rst.getString("AES_DECRYPT(PASSWORD,'1')"));
                Owner.add(o1);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Owner;
    }

    @Override
    public int insert(OwnerModel ownerModel) throws ClassNotFoundException, SQLException {
        int res=-1;
        try {
            Statement stm=resourceConnection.getConnection().createStatement();
            res = stm.executeUpdate("INSERT INTO Owner VALUES('" + ownerModel.getOwnerId() + "',AES_ENCRYPT('" + ownerModel.getUserName() +"','1'),AES_ENCRYPT('" + ownerModel.getPassword()+ "','1'))");
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
