/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author DaniBoy
 */
@Entity
public class Hotel{
    private int hId;
    private String hName;
    private String hAdress1;
    private String hAdress2;
    private String hAdress3;
    private String phone;
    private int starRate;

    public Hotel(int hId, String hName, String hAdress1, String hAdress2, String hAdress3, String phone, int starRate) {
        this.hId = hId;
        this.hName = hName;
        this.hAdress1 = hAdress1;
        this.hAdress2 = hAdress2;
        this.hAdress3 = hAdress3;
        this.phone = phone;
        this.starRate = starRate;
    }

    public Hotel(String hName, String hAdress1, String hAdress2, String hAdress3, String phone, int starRate) {
        this.hName = hName;
        this.hAdress1 = hAdress1;
        this.hAdress2 = hAdress2;
        this.hAdress3 = hAdress3;
        this.phone = phone;
        this.starRate = starRate;
    }
    

    public Hotel() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int gethId() {
        return hId;
    }

    public void sethId(int hId) {
        this.hId = hId;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public String gethAdress1() {
        return hAdress1;
    }

    public void sethAdress1(String hAdress1) {
        this.hAdress1 = hAdress1;
    }

    public String gethAdress2() {
        return hAdress2;
    }

    public void sethAdress2(String hAdress2) {
        this.hAdress2 = hAdress2;
    }

    public String gethAdress3() {
        return hAdress3;
    }

    public void sethAdress3(String hAdress3) {
        this.hAdress3 = hAdress3;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStarRate() {
        return starRate;
    }

    public void setStarRate(int starRate) {
        this.starRate = starRate;
    }
}
