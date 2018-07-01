/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.dao.impl;

import com.supermkt.shoppingcrt.conn.ResourceConnection;
import com.supermkt.shoppingcrt.conn.ResourceConnectionFactory;
import com.supermkt.shoppingcrt.dao.ItemCategoryDAO;
import com.supermkt.shoppingcrt.model.ItemCategoryModel;
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
public class ItemCategoryDAOImpl implements ItemCategoryDAO{
    
    ResourceConnection resourceConnection=new ResourceConnectionFactory().getConnection();

    @Override
    public int insert(ItemCategoryModel itemCategoryModel) throws ClassNotFoundException, SQLException {
        int res=-1;
        try {
            Statement stm=resourceConnection.getConnection().createStatement();
            res = stm.executeUpdate("INSERT INTO itemcategory VALUES('" + itemCategoryModel.getItemcategoryId() + "','" + itemCategoryModel.getItemCategory() + "')");
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
    public List<ItemCategoryModel> readAll() throws ClassNotFoundException, SQLException {
        ArrayList<ItemCategoryModel> itemcatlist=null;
        try {
            String SQL = "Select * From Itemcategory";
            Connection con = resourceConnection.getConnection();
            Statement stm = con.createStatement();
            ResultSet rst = stm.executeQuery(SQL);
            itemcatlist = new ArrayList<>();
            while (rst.next()) {
                ItemCategoryModel t1 = new ItemCategoryModel();
                t1.setItemcategoryId(rst.getString("ITEMCATEGORYiD"));
                t1.setItemCategory(rst.getString("ITEMCATEGORY"));
                itemcatlist.add(t1);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itemcatlist;
    }
    
}
