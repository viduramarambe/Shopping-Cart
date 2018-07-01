/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.service;

import com.supermkt.shoppingcrt.dto.OwnerDTO;
import java.util.List;

/**
 *
 * @author Vidura Marambe
 */
public interface OwnerService {
    public boolean saveOwner(OwnerDTO ownerDTO);
    public List<OwnerDTO> showOwner();
}
