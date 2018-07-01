/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.service.impl;

import com.supermkt.shoppingcrt.dao.CustomerDAO;
import com.supermkt.shoppingcrt.dao.impl.DAOFactory;
import com.supermkt.shoppingcrt.service.CustomerService;
import com.supermkt.shoppingcrt.dto.CustomerDTO;
import com.supermkt.shoppingcrt.model.CustomerModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vidura Marambe
 */
public class CustomerServiceImpl implements CustomerService{
    
    CustomerDAO customerDAO= new DAOFactory().getCustomerDAO();

    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) {
        CustomerModel customerModel=new CustomerModel();
        customerModel.setCustomerId(customerDTO.getCustomerId());
        customerModel.setUserName(customerDTO.getUserName());
        customerModel.setPassword(customerDTO.getPassword());
        customerModel.setMobile(customerDTO.getMobile());
        boolean res=false;
        try {
            res=(0<customerDAO.insert(customerModel));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    @Override
    public List<CustomerDTO> showCustomers() {
        List<CustomerDTO> custDtoList=null;
        try {
            List<CustomerModel> custList = customerDAO.readAll();
            custDtoList= new ArrayList<>();
            for (CustomerModel custList1 : custList) {
                CustomerDTO c1 = new CustomerDTO();
                c1.setCustomerId(custList1.getCustomerId());
                c1.setUserName(custList1.getUserName());
                c1.setPassword(custList1.getPassword());
                c1.setMobile(custList1.getMobile());
                custDtoList.add(c1);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return custDtoList;
    }

    @Override
    public boolean editCustomer(CustomerDTO customerDTO) {
        CustomerModel customerModel=new CustomerModel();
        customerModel.setCustomerId(customerDTO.getCustomerId());
        customerModel.setUserName(customerDTO.getUserName());
        customerModel.setPassword(customerDTO.getPassword());
        customerModel.setMobile(customerDTO.getMobile());
        boolean res=false;
        try {
            res=(0<customerDAO.update(customerModel));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    @Override
    public boolean deleteCustomer(CustomerDTO customerDTO) {
        CustomerModel customerModel = new CustomerModel();
        customerModel.setCustomerId(customerDTO.getCustomerId());
        boolean res=false;
        try {
            res = 0<customerDAO.delete(customerModel);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
}
