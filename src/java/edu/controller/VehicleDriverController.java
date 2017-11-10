/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.controller;

import edu.model.VehicleDriver;
import edu.service.VehicleDriverService;
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
public class VehicleDriverController {

    @Autowired
    VehicleDriverService service;

    @RequestMapping(value = "driverform")
    public String toAddDriverFor() {
        return "adddriver";
    }
    
    @RequestMapping(value = "/toviewdrivers")
    public String viewAllDriver() {
        return "viewdrivers";
    }

    @RequestMapping(value = "/adddriver", method = RequestMethod.POST)
    public String addNewDriver(@RequestParam(value = "salary") String salary, @RequestParam(value = "phone") String phone, @RequestParam(value = "dname") String driverName, @RequestParam(value = "licenceno") String licenceNo, @RequestParam(value = "licencecat") String licenceCat) {
        Double dSalary = Double.parseDouble(salary);
        VehicleDriver driver = new VehicleDriver(phone, licenceNo, licenceCat, phone, dSalary);
        service.addNewVehicleDriver(driver);
        return "adddriver";
    }

    @RequestMapping(value = "/deletedriver")
    public String deleteDriver(@RequestParam(value = "id") String id) {
        int dId = Integer.parseInt(id);
        int res = service.removeVehicleDriver(dId);
        return "deletedriver";
    }

    @RequestMapping(value = "/viewalldrivers")
    public ModelAndView viewAllDrivers(ModelAndView mav) {
        List<VehicleDriver> listDriver = service.viewAllVehicleDriver();
        mav.addObject("dlist", listDriver);
        mav.setViewName("home");
        return mav;
    }

    @RequestMapping(value = "/updatedriver", method = RequestMethod.POST)
    public String updateDriver(@RequestParam(value = "driverid") String id, @RequestParam(value = "salary") String salary, @RequestParam(value = "phone") String phone, @RequestParam(value = "dname") String driverName, @RequestParam(value = "licenceno") String licenceNo, @RequestParam(value = "licencecat") String licenceCat) {
        int driverId = Integer.parseInt(id);
        Double dSalary = Double.parseDouble(salary);
        VehicleDriver driver = new VehicleDriver(driverId, phone, licenceNo, licenceCat, phone, dSalary);
        int res = service.updateCustomerDetail(driver);
        return "viewdrivers";
    }
    @RequestMapping(value = "/updateiddriver")
    public ModelAndView updateDirectdriver(ModelAndView mav,@RequestParam(value = "id")String id){
        mav.addObject("vdid",id);
        mav.setViewName("updatedriver");
        return mav;
    } 
}
