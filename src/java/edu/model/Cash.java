/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.model;

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
public class Cash {
    private int cashId;
    private Double amount;
    private Date payedDate;

    public Cash() {
    }
    

    public Cash(int cashId, Double amount, Date payedDate) {
        this.cashId = cashId;
        this.amount = amount;
        this.payedDate = payedDate;
    }

    public Cash(Double amount, Date payedDate) {
        this.amount = amount;
        this.payedDate = payedDate;
    }

    public Date getPayedDate() {
        return payedDate;
    }

    public void setPayedDate(Date payedDate) {
        this.payedDate = payedDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getCashId() {
        return cashId;
    }

    public void setCashId(int cashId) {
        this.cashId = cashId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    
}
