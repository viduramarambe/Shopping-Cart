/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.dao;

import com.supermkt.shoppingcrt.model.OwnerModel;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Vidura Marambe
 */
public interface OwnerDAO {
    public int insert(OwnerModel ownerModel) throws ClassNotFoundException,SQLException;
    public List<OwnerModel> read() throws ClassNotFoundException,SQLException;
}
