/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.controller;

import edu.dao.HotelDao;
import edu.model.Hotel;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
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
public class HotelController {

    @Autowired
    HotelDao hotelDao;

    @RequestMapping(value = "/addnewhotel")
    public String hotelForm(HttpServletRequest request) {
        return "addhotel";
    }

    @RequestMapping(value = "/addnewhotel", method = RequestMethod.POST)
    public String saveHotel(@RequestParam(value = "name") String name, @RequestParam(value = "address1") String address1, @RequestParam(value = "address2") String address2, @RequestParam(value = "address3") String address3, @RequestParam(value = "phone") String phone, @RequestParam(value = "srate") String sRate) {

        int rate = Integer.parseInt(sRate);

        System.out.println(sRate);
        Hotel entity = new Hotel(name, address1, address2, address3, phone, rate);
        hotelDao.addNewHotel(entity);
        return "addhotel";
    }

    @RequestMapping(value = "/viewallhotel")
    public ModelAndView viewAllHotels(ModelAndView mav) throws ServletException, IOException {
        List<Hotel> hotelList = hotelDao.viewAllHotel();
        mav.addObject("hlist", hotelList);
        mav.setViewName("home");
        return mav;
    }

    @RequestMapping(value = "/deletehotel", method = RequestMethod.GET)
    public String deleteHotel(@RequestParam(value = "id") String id) {
        int hid = Integer.parseInt(id);
        int res = hotelDao.removeHotel(hid);
        System.out.println("Result Value id :+|" + res);
        return "NewJsp";
    }

    @RequestMapping(value = "/updatehotel", method = RequestMethod.POST)
    public String updateHotel(@RequestParam(value = "id") String id, @RequestParam(value = "name") String name, @RequestParam(value = "address1") String address1, @RequestParam(value = "address2") String address2, @RequestParam(value = "address3") String address3, @RequestParam(value = "phone") String phone, @RequestParam(value = "srate") String sRate) {
        int hid = Integer.parseInt(id);
        int star = Integer.parseInt(sRate);
        Hotel hotel = new Hotel(hid, name, address1, address2, address3, phone, star);
        int res = hotelDao.updateHotelDetail(hotel, hid);
        return "viewhotels";
    }

    @RequestMapping(value = "/viewallhotels", method = RequestMethod.GET)
    public String viewAllVehicleLoad() {
        return "viewhotels";
    }

    @RequestMapping(value = "/updateidhotel")
    public ModelAndView updateidHitel(ModelAndView mav, @RequestParam(value = "id") String id) {
        mav.addObject("hid", id);
        mav.setViewName("updatehotel");
        return mav;
    }
}
