/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.service;

import edu.model.Booking;

/**
 *
 * @author DaniBoy
 */
public interface TripService {

    public int addNewTrip(Booking booking);

    public int removeTrip(int id);

    public int updateTrip(int id,double amount);

}
