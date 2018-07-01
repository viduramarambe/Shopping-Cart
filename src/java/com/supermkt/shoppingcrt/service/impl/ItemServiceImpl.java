/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.service.impl;

import com.supermkt.shoppingcrt.dao.ItemDAO;
import com.supermkt.shoppingcrt.dao.impl.DAOFactory;
import com.supermkt.shoppingcrt.dto.CustomerDTO;
import com.supermkt.shoppingcrt.service.ItemService;
import com.supermkt.shoppingcrt.dto.ItemDTO;
import com.supermkt.shoppingcrt.model.ItemModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vidura Marambe
 */
public class ItemServiceImpl implements ItemService {

    ItemDAO itemDAO = new DAOFactory().getItemDAO();

    @Override
    public boolean saveItem(ItemDTO itemDTO) {
        ItemModel itemModel = new ItemModel();
        itemModel.setItemId(itemDTO.getItemId());
        itemModel.setItemCategory(itemDTO.getItemCategory());
        itemModel.setItemName(itemDTO.getItemName());
        itemModel.setItemQty(itemDTO.getItemQty());
        itemModel.setUnitPrice(itemDTO.getUnitPrice());
        boolean res = false;
        try {
            res = (0 < itemDAO.insert(itemModel));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    @Override
    public List<ItemDTO> showItems() {
        List<ItemDTO> itemDtoList = null;
        try {
            List<ItemModel> itemList = itemDAO.readAll();
            itemDtoList = new ArrayList<>();
            for (ItemModel itemList1 : itemList) {
                ItemDTO t1 = new ItemDTO();
                t1.setItemId(itemList1.getItemId());
                t1.setItemCategory(itemList1.getItemCategory());
                t1.setItemName(itemList1.getItemName());
                t1.setItemQty(itemList1.getItemQty());
                t1.setUnitPrice(itemList1.getUnitPrice());
                itemDtoList.add(t1);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itemDtoList;
    }

    @Override
    public boolean editItem(ItemDTO itemDTO) {
        ItemModel itemModel = new ItemModel();
        itemModel.setItemId(itemDTO.getItemId());
        itemModel.setItemCategory(itemDTO.getItemCategory());
        itemModel.setItemName(itemDTO.getItemName());
        itemModel.setItemQty(itemDTO.getItemQty());
        itemModel.setUnitPrice(itemDTO.getUnitPrice());
        boolean res = false;
        try {
            res = (0 < itemDAO.update(itemModel));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    @Override
    public boolean deleteItem(ItemDTO itemDTO) {
        ItemModel itemModel = new ItemModel();
        itemModel.setItemId(itemDTO.getItemId());
        boolean res = false;
        try {
            res = (0 < itemDAO.delete(itemModel));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

}
