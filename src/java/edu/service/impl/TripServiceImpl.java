/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.service.impl;

import edu.dao.TripDao;
import edu.model.Booking;
import edu.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;



/**
 *
 * @author DaniBoy
 */
@Component
@Transactional
public class TripServiceImpl implements TripService{
    
    @Autowired
    TripDao tripDao;

    @Override
    public int addNewTrip(Booking booking) {
        int res=tripDao.addNewTrip(booking);
        return res;
    }

    @Override
    public int removeTrip(int id) {
        int res=tripDao.removeTrip(id);
        return res;
    }

    @Override
    public int updateTrip(int id,double amount) {
        int res=tripDao.updatetrip(id, amount);
        return res;
    }
    
}
