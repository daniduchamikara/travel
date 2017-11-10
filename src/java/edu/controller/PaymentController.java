/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.controller;

import edu.model.Payment;
import edu.service.PaymentService;
import edu.service.TripService;
import java.util.Date;
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
public class PaymentController {

    @Autowired
    PaymentService paymentService;
    
    @Autowired
    TripService tripService;

    @RequestMapping(value = "/topayment")
    private String toPayment() {
        return "paymentcussearch";
    }

    @RequestMapping(value = "/makepayment")
    private String makePayment() {
        return "paymentmake";
    }

    @RequestMapping(value = "/instalmentpaying")
    private String payinstalment() {
        return "payinstallment";
    }
    
    
    @RequestMapping(value = "/toselecttrip")
    private ModelAndView toSelectTrip(@RequestParam(value = "cusid") String cusid) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("cusid", cusid);
        mav.setViewName("paymenttripselect");
        return mav;
    }
    
    //2
    @RequestMapping(value = "/toselecttripins")
    private ModelAndView toSelectTripIns(@RequestParam(value = "cusid") String cusid) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("cusid", cusid);
        mav.setViewName("paymenttripselectins");
        return mav;
    }
    
    @RequestMapping(value = "/finishpayment")
    private ModelAndView finishpayment(@RequestParam(value = "amount") String amount,@RequestParam(value = "tripid") String tripid) {
        ModelAndView mav = new ModelAndView();
        int pAmount = Integer.parseInt(amount);
        int trip=Integer.parseInt(tripid);
        tripService.updateTrip(trip, pAmount);
        mav.setViewName("index");
        return mav;
    }
    
    

    @RequestMapping(value = "/payinstallmentpro")
    private ModelAndView payInstallment(@RequestParam(value = "dueamount") String dueamount,@RequestParam(value = "amount") String amount,@RequestParam(value = "tripid") String tripid) {
        ModelAndView mav = new ModelAndView();
        Double pAmount = Double.parseDouble(amount);
        Double pDueAmount = Double.parseDouble(dueamount);
        Double tripamount=pAmount-pDueAmount;
        int trip=Integer.parseInt(tripid);
        Date date = new Date();
        Payment payment = new Payment(date, pAmount, trip);
        tripService.updateTrip(trip, tripamount);
        paymentService.makeNewPayment(payment);
        mav.setViewName("indexs");
        return mav;
    }

    
}
