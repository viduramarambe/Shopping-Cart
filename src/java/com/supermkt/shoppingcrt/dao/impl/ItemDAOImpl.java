/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.dao.impl;

import com.supermkt.shoppingcrt.conn.ResourceConnection;
import com.supermkt.shoppingcrt.conn.ResourceConnectionFactory;
import com.supermkt.shoppingcrt.dao.ItemDAO;
import com.supermkt.shoppingcrt.model.CustomerModel;
import com.supermkt.shoppingcrt.model.ItemModel;
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
public class ItemDAOImpl implements ItemDAO{
    
    ResourceConnection resourceConnection=new ResourceConnectionFactory().getConnection();

    @Override
    public int insert(ItemModel itemModel) throws ClassNotFoundException, SQLException {
         int res=-1;
        try {
            Statement stm=resourceConnection.getConnection().createStatement();
            res = stm.executeUpdate("INSERT INTO Item VALUES('" + itemModel.getItemId() + "','" + itemModel.getItemCategory() + "','" + itemModel.getItemName()+ "','" +itemModel.getItemQty() +"','"+itemModel.getUnitPrice()+ "')");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return res;
    }

    @Override
    public List<ItemModel> readAll() throws ClassNotFoundException, SQLException {
        ArrayList<ItemModel> Itemlist=null;
        try {
            String SQL = "Select * From Item";
            Connection con = resourceConnection.getConnection();
            Statement stm = con.createStatement();
            ResultSet rst = stm.executeQuery(SQL);
            Itemlist = new ArrayList<>();
            while (rst.next()) {
                ItemModel t1 = new ItemModel();
                t1.setItemId(rst.getString("ITEMID"));
                t1.setItemCategory(rst.getString("ITEMCATEGORY"));
                t1.setItemName(rst.getString("ITEMNAME"));
                t1.setItemQty(rst.getString("ITEMQTY"));
                t1.setUnitPrice(rst.getString("UNITPRICE"));
                Itemlist.add(t1);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Itemlist;
    }

    @Override
    public int update(ItemModel itemModel) throws ClassNotFoundException, SQLException {
        int res=-1;
        try {
            Connection con = resourceConnection.getConnection();
            Statement stm = con.createStatement();
            res = stm.executeUpdate("Update ITEM set ITEMCATEGORY='" + itemModel.getItemCategory() + "', ITEMNAME='" + itemModel.getItemName()+ "', ITEMQTY='" +itemModel.getItemQty()+ "',UNITPRICE='"+itemModel.getUnitPrice()+"' where ITEMID='" + itemModel.getItemId() + "'");
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
    public int delete(ItemModel itemModel) throws ClassNotFoundException, SQLException {
        int res=-1;
        try {
            Connection con = resourceConnection.getConnection();
            Statement stm = con.createStatement();
            res= stm.executeUpdate("Delete From Item where ITEMID='" + itemModel.getItemId() + "'");
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
