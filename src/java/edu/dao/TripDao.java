/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.dao;

import edu.model.Booking;

/**
 *
 * @author DaniBoy
 */
public interface TripDao {

    public int addNewTrip(Booking booking);

    public int removeTrip(int id);

    public int updatetrip(int id,double amount);
}
