/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author DaniBoy
 */
@Entity
public class Booking  implements Serializable{
    
    private int tripid;
    private String heading;
    private Date checkIn;
    private Date checkout;
    private Double dueAmount;
    private int cusId;
    private int vehicleId;
    private int driverId;

    public Booking(String heading, Date checkIn, Date checkout, Double dueAmount, int cusId, int vehicleId, int driverId) {
        this.heading = heading;
        this.checkIn = checkIn;
        this.checkout = checkout;
        this.dueAmount = dueAmount;
        this.cusId = cusId;
        this.vehicleId = vehicleId;
        this.driverId = driverId;
    }

    public Booking(String heading, Date checkIn, Date checkout, int cusId, int vehicleId, int driverId) {
        this.heading = heading;
        this.checkIn = checkIn;
        this.checkout = checkout;
        this.cusId = cusId;
        this.vehicleId = vehicleId;
        this.driverId = driverId;
    }

    public Booking(int tripid, Double dueAmount) {
        this.tripid = tripid;
        this.dueAmount = dueAmount;
    }

    
    
    

    public Booking() {
    }

    public Double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(Double dueAmount) {
        this.dueAmount = dueAmount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getTripid() {
        return tripid;
    }

    public void setTripid(int tripid) {
        this.tripid = tripid;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }
    
    
   
    }

   