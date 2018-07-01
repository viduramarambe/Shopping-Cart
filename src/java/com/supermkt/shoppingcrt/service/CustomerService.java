/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supermkt.shoppingcrt.service;

import com.supermkt.shoppingcrt.dto.CustomerDTO;
import java.util.List;

/**
 *
 * @author Vidura Marambe
 */
public interface CustomerService {
    public boolean saveCustomer(CustomerDTO customerDTO);
    public List<CustomerDTO> showCustomers();
    public boolean editCustomer(CustomerDTO customerDTO);
    public boolean deleteCustomer(CustomerDTO customerDTO);
}
