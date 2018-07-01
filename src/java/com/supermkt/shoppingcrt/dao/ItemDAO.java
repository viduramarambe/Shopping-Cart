/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.dao;

import com.supermkt.shoppingcrt.model.ItemModel;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Vidura Marambe
 */
public interface ItemDAO {
    public int insert(ItemModel itemModel) throws ClassNotFoundException,SQLException;
    public List<ItemModel> readAll() throws ClassNotFoundException,SQLException;
    public int update(ItemModel itemModel) throws ClassNotFoundException,SQLException;
    public int delete(ItemModel itemModel) throws ClassNotFoundException,SQLException;
}
