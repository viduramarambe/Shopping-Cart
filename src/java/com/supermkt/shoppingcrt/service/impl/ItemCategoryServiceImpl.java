/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.service.impl;

import com.supermkt.shoppingcrt.dao.ItemCategoryDAO;
import com.supermkt.shoppingcrt.dao.impl.DAOFactory;
import com.supermkt.shoppingcrt.service.ItemCategoryService;
import com.supermkt.shoppingcrt.dto.ItemCategoryDTO;
import com.supermkt.shoppingcrt.model.ItemCategoryModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vidura Marambe
 */
public class ItemCategoryServiceImpl implements ItemCategoryService{
    
    ItemCategoryDAO itemCategoryDAO= new DAOFactory().getItemCategoryDAO();

    @Override
    public boolean saveItemCategory(ItemCategoryDTO itemCategoryDTO) {
        ItemCategoryModel itemCategoryModel=new ItemCategoryModel();
        itemCategoryModel.setItemcategoryId(itemCategoryDTO.getItemcategoryId());
        itemCategoryModel.setItemCategory(itemCategoryDTO.getItemCategory());
        boolean res=false;
        try {
            res=(0<itemCategoryDAO.insert(itemCategoryModel));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    @Override
    public List<ItemCategoryDTO> showItemCategories() {
        List<ItemCategoryDTO> itemcatList=null;
        try {
            List<ItemCategoryModel> itemCategoryModels=itemCategoryDAO.readAll();
            itemcatList=new ArrayList<>();
            for (ItemCategoryModel itemCategoryModel : itemCategoryModels) {
                ItemCategoryDTO itemCategoryDTO=new ItemCategoryDTO();
                itemCategoryDTO.setItemcategoryId(itemCategoryModel.getItemcategoryId());
                itemCategoryDTO.setItemCategory(itemCategoryModel.getItemCategory());
                itemcatList.add(itemCategoryDTO);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemCategoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemCategoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itemcatList;
    }
    
}
