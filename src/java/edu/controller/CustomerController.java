/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.controller;

import edu.model.Customer;
import edu.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author DaniBoy
 */
@Transactional
@Controller
public class CustomerController {

    @Autowired
    CustomerService service;

    @RequestMapping(value = "addcus")
    private String toaddCustomer() {
        return "addcustomer";
    }

    @RequestMapping(value = "/createCustomer", method = RequestMethod.POST)
    public String createCustomer(@RequestParam(value = "cname") String name, @RequestParam(value = "passportno") String passportNo, @RequestParam(value = "country") String country, @RequestParam(value = "address") String address, @RequestParam(value = "phone") String phone, @RequestParam(value = "email") String email) {
        Customer customer = new Customer(name, passportNo, country, address, phone, email);
        service.addNewCustomer(customer);
        return "addcustomer";

    }
    
     @RequestMapping(value = "/justcreateCustomer", method = RequestMethod.POST)
    public String justcreateCustomer(@RequestParam(value = "cname") String name, @RequestParam(value = "passportno") String passportNo, @RequestParam(value = "country") String country, @RequestParam(value = "address") String address, @RequestParam(value = "phone") String phone, @RequestParam(value = "email") String email) {
        Customer customer = new Customer(name, passportNo, country, address, phone, email);
        service.addNewCustomer(customer);
        return "tripselectcus";

    }

    @RequestMapping(value = "/deleteCustomer", method = RequestMethod.GET)
    public String deleteCustomer(@RequestParam(value = "id") String id) {
        int cid = Integer.parseInt(id);
        service.removeCustomer(cid);
        return "viewcustomers";
    }

    @RequestMapping(value = "/updatecustomer", method = RequestMethod.POST)
    public String updateCustomer(@RequestParam(value = "cid") String cId, @RequestParam(value = "cname") String name, @RequestParam(value = "passportno") String passportNo, @RequestParam(value = "country") String country, @RequestParam(value = "address") String address, @RequestParam(value = "phone") String phone, @RequestParam(value = "email") String email) {
        int id = Integer.parseInt(cId);
        Customer customer = new Customer(id, name, passportNo, country, address, phone, email);
        service.updateCustomerDetail(customer);
        return "viewcustomers";
    }

    @RequestMapping(value = "/viewallc1ustomers",method = RequestMethod.GET)
    public ModelAndView viewAllCustomers(ModelAndView mav) {
        List<Customer> cusList = service.viewAllCustomer();
        mav.addObject("cuslist", cusList);
        mav.setViewName("home");
        return mav;
    }
    
    @RequestMapping(value = "/viewallcustomers", method = RequestMethod.GET)
    public String viewAllCustomerLoad() {
        return "viewcustomers";
    }

    @RequestMapping(value = "/updateidcustomer")
    public ModelAndView updateidCustomer(ModelAndView mav, @RequestParam(value = "id") String id) {
        mav.addObject("cid", id);
        mav.setViewName("updatecustomer");
        return mav;
    }
    
    
}
