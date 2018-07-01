/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.service;

import com.supermkt.shoppingcrt.dto.ItemCategoryDTO;
import java.util.List;

/**
 *
 * @author Vidura Marambe
 */
public interface ItemCategoryService {
    public boolean saveItemCategory(ItemCategoryDTO itemCategoryDTO);
    public List<ItemCategoryDTO> showItemCategories();
}
