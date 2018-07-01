/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.dao;

import com.supermkt.shoppingcrt.model.ItemCategoryModel;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Vidura Marambe
 */
public interface ItemCategoryDAO {
    public int insert(ItemCategoryModel itemCategoryModel) throws ClassNotFoundException,SQLException;
    List<ItemCategoryModel> readAll() throws ClassNotFoundException,SQLException;
}
