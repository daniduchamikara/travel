/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.controller;

import edu.model.Booking;
import edu.service.TripService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author DaniBoy
 */
@Transactional
@Controller
public class TripController {

    @Autowired
    TripService service;

    @RequestMapping(value = "/tripcus")
    private String bookingTrip() {
        return "tripselectcus";
    }

    @RequestMapping(value = "/finshbooking")
    private String bookingFinish() {
        return "finishtrip";
    }

    @RequestMapping(value = "/selectscope")
    private String bookingScope() {
        return "tripscope";
    }

    @RequestMapping(value = "/selectdriver")
    ModelAndView selectDriver(HttpServletRequest request, @RequestParam(value = "heding") String heading,@RequestParam(value = "from") String from, @RequestParam(value = "to") String to, @RequestParam("cusid") String cusid) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("tripselectdriver");
        mav.addObject("cusid", cusid);
        mav.addObject("from", from);
        mav.addObject("to", to);
        mav.addObject("heding", heading);
        return mav;
    }

    @RequestMapping(value = "/tripdsearch")
    private String selectDriver() {
        return "tripselectdriver";
    }
        @RequestMapping(value = "/searctripbycus")
    private String tripSelectByCus() {
        return "tripsearchbycus";
    }
        @RequestMapping(value = "/searctripbycusins")
    private String tripSelectByCusIns() {
        return "tripsearchbycusins";
    }

    @RequestMapping(value = "/selectvehicle")
    ModelAndView selectVehicle( @RequestParam(value = "heding") String heading,@RequestParam(value = "from") String from, @RequestParam(value = "to") String to, @RequestParam("cusid") String cusid, @RequestParam("driverid") String driverid) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("tripselectvehicle");
        mav.addObject("cusid", cusid);
        mav.addObject("from", from);
        mav.addObject("to", to);
        mav.addObject("driverid", driverid);
        mav.addObject("heding", heading);
        return mav;
    }

    @RequestMapping(value = "/createtrip")
    ModelAndView createTrip(@RequestParam(value = "heding") String heading,@RequestParam(value = "from") String from, @RequestParam(value = "to") String to, @RequestParam("cusid") String cusid, @RequestParam("driverid") String driverid, @RequestParam("vid") String vid) throws ParseException {
        ModelAndView mav = new ModelAndView();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        Date checkin=formatter.parse(from);
        Date checkout=formatter.parse(to);  
        int cust = Integer.parseInt(cusid);
        int driver = Integer.parseInt(driverid);
        int vehicle = Integer.parseInt(vid);
        mav.setViewName("index_1");
        Booking booking = new Booking(heading,checkin, checkout, cust, vehicle, driver);
        int res = service.addNewTrip(booking);
        return mav;
    }
}
