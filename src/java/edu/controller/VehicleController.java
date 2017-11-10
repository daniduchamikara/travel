/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.controller;

import edu.model.Vehicle;
import edu.service.VehicleService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author DaniBoy
 */
@Controller
@Transactional
public class VehicleController {

    @Autowired
    VehicleService service;

    @RequestMapping(value = "/addnewvehicle", method = RequestMethod.GET)
    public String vehicload() {
        return "addvehicle";
    }

    @RequestMapping(value = "/createVehicle", method = RequestMethod.POST)
    public String addNewUser(@RequestParam(value = "vname") String vname, @RequestParam(value = "regno") String regno, @RequestParam(value = "vmodel") String vmodel, @RequestParam(value = "vyear") String vyear, @RequestParam(value = "vtype") String vtype, @RequestParam(value = "ac") String ac, @RequestParam(value = "fee") String fee) {
        double vehiclefee = Double.valueOf(fee);
        Vehicle vehicle = new Vehicle(vname, regno, vtype, vmodel, ac, vyear, vehiclefee);
        int res = service.addNewVehicle(vehicle);
        if (res > 0) {
            return "addvehicle";
        }
        return "error";
    }

    @RequestMapping(value = "/deleteVehicle")
    public String deleteUser(@RequestParam(value = "id") String id) {
        int vId = Integer.parseInt(id);
        int res = service.removeVehicle(vId);
        return "viewvehicle";
    }
    
    @RequestMapping(value = "/viewallvehicle", method = RequestMethod.GET)
    public String viewAllVehicleLoad(){
        return "viewvehicle";
    }
    
    @RequestMapping(value = "/updateidvehicle")
    public ModelAndView updateidDirectvehicle(ModelAndView mav,@RequestParam(value = "id")String id){
        mav.addObject("vid",id);
        mav.setViewName("updatevehicle");
        return mav;
    } 

    @RequestMapping(value = "/viewallvehicles", method = RequestMethod.GET)
    public ModelAndView viewAllVehicles(ModelAndView mav) {
        List<Vehicle> vehicleList = service.viewAllVehicle();
        mav.addObject("vlist", vehicleList);
        mav.setViewName("home");
        return mav;
    }

    
    @RequestMapping(value = "updatevehicle", method = RequestMethod.POST)
    public String updateVehicles(@RequestParam(value = "vid") String vid, @RequestParam(value = "vname") String vname, @RequestParam(value = "regno") String regno, @RequestParam(value = "vmodel") String vmodel, @RequestParam(value = "vyear") String vyear, @RequestParam(value = "vtype") String vtype, @RequestParam(value = "ac") String ac, @RequestParam(value = "fee") String fee) {
        int vehicleId = Integer.parseInt(vid);
        double vehiclefee = Double.valueOf(fee);
        Vehicle vehicle = new Vehicle(vehicleId, vname, vname, vtype, vmodel, ac, vyear, vehiclefee);
        service.updateVehicleDetail(vehicle);
        return "viewvehicle";
    }

}
