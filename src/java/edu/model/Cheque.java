/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author DaniBoy
 */
@Entity
public class Cheque implements Serializable {
    private int cid;
    private String chequeNo;
    private Date chequeDate;
    private Double paymentAmount;

    public Cheque() {
    }
    

    public Cheque(int cid, String chequeNo, Date chequeDate, Double paymentAmount) {
        this.cid = cid;
        this.chequeNo = chequeNo;
        this.chequeDate = chequeDate;
        this.paymentAmount = paymentAmount;
    }

    public Cheque(String chequeNo, Date chequeDate, Double paymentAmount) {
        this.chequeNo = chequeNo;
        this.chequeDate = chequeDate;
        this.paymentAmount = paymentAmount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getChequeNo() {
        return chequeNo;
    }

    public void setChequeNo(String chequeNo) {
        this.chequeNo = chequeNo;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Date getChequeDate() {
        return chequeDate;
    }

    public void setChequeDate(Date chequeDate) {
        this.chequeDate = chequeDate;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
    
    
}
