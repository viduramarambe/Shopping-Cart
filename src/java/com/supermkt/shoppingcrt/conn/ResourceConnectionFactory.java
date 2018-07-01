/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.conn;

import com.supermkt.shoppingcrt.conn.impl.ResourceConnectionImpl;

/**
 *
 * @author Vidura Marambe
 */
public class ResourceConnectionFactory {
    public ResourceConnection getConnection(){
        return new ResourceConnectionImpl();
    }
}
