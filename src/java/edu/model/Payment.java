/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author DaniBoy
 */
@Entity
public class Payment {
    private int paymentId;
    private Date paymentDate;
    private Double pAmount;
    private int tripid;

    public Payment(Date paymentDate, Double pAmount, int tripid) {
        this.paymentDate = paymentDate;
        this.pAmount = pAmount;
        this.tripid = tripid;
    }

    public Payment() {
    }

    
    public int getTripid() {
        return tripid;
    }

    public void setTripid(int tripid) {
        this.tripid = tripid;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Double getpAmount() {
        return pAmount;
    }

    public void setpAmount(Double pAmount) {
        this.pAmount = pAmount;
    }
    
    
}
