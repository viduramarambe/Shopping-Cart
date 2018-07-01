/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.service.impl;

import com.supermkt.shoppingcrt.dao.OwnerDAO;
import com.supermkt.shoppingcrt.dao.impl.DAOFactory;
import com.supermkt.shoppingcrt.service.OwnerService;
import com.supermkt.shoppingcrt.dto.OwnerDTO;
import com.supermkt.shoppingcrt.model.OwnerModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vidura Marambe
 */
public class OwnerServiceImpl implements OwnerService{

    OwnerDAO ownerDAO=new DAOFactory().getOwnerDAO();
    
    @Override
    public List<OwnerDTO> showOwner() {
        List<OwnerDTO> ownDtoList = null;
        try {
            List<OwnerModel> ownList = ownerDAO.read();
            ownDtoList = new ArrayList<>();
            for (OwnerModel ownList1 : ownList) {
                OwnerDTO o1 = new OwnerDTO();
                o1.setOwnerId(ownList1.getOwnerId());
                o1.setUserName(ownList1.getUserName());
                o1.setPassword(ownList1.getPassword());
                ownDtoList.add(o1);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ownDtoList;
    }

    @Override
    public boolean saveOwner(OwnerDTO ownerDTO) {
        OwnerModel ownerModel=new OwnerModel();
        ownerModel.setOwnerId(ownerDTO.getOwnerId());
        ownerModel.setUserName(ownerDTO.getUserName());
        ownerModel.setPassword(ownerDTO.getPassword());
        boolean res=false;
        try {
            res=(0<ownerDAO.insert(ownerModel));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
}
