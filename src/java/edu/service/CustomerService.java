/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.service;

import edu.model.Customer;
import java.util.List;

/**
 *
 * @author DaniBoy
 */
public interface CustomerService {
    public int addNewCustomer(Customer customer);

    public int removeCustomer(int id);

    public List<Customer> searchCustomer(String name, int id);

    public List<Customer> viewAllCustomer();

    public int updateCustomerDetail(Customer customer);
}
