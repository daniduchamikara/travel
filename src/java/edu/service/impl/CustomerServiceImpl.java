/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.service.impl;

import edu.dao.CustomerDao;
import edu.model.Customer;
import edu.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DaniBoy
 */
@Component
@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerDao customerDao;
    
    @Override
    public int addNewCustomer(Customer customer) {
       customerDao.addNewCustomer(customer);
       return 1;
    }

    @Override
    public int removeCustomer(int id) {
        customerDao.removeCustomer(id);
        return 1;
    }

    @Override
    public List<Customer> searchCustomer(String name, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> viewAllCustomer() {
//        List<Customer> cusList=customerDao.viewAllCustomer();
//        return cusList;
return customerDao.viewAllCustomer();
    }

    @Override
    public int updateCustomerDetail(Customer customer) {
         int res=customerDao.updateCustomerDetail(customer);
        return res;
    }
    
}
