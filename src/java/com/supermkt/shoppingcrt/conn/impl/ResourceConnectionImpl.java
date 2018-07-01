/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.conn.impl;


import com.supermkt.shoppingcrt.conn.ResourceConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vidura Marambe
 */
public class ResourceConnectionImpl implements ResourceConnection{

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "root");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ResourceConnectionImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (SQLException ex) {
            Logger.getLogger(ResourceConnectionImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return con;
    }
    
}
