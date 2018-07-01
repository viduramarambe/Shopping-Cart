/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.conn;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Vidura Marambe
 */
public interface ResourceConnection {
    public Connection getConnection() throws ClassNotFoundException,SQLException;
}
