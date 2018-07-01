/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.service;

import com.supermkt.shoppingcrt.dto.ItemDTO;
import java.util.List;

/**
 *
 * @author Vidura Marambe
 */
public interface ItemService {
    public boolean saveItem(ItemDTO itemDTO);
    public List<ItemDTO> showItems();
    public boolean editItem(ItemDTO itemDTO);
    public boolean deleteItem(ItemDTO itemDTO);
}
