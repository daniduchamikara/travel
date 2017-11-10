/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.model;

import java.io.Serializable;
import java.util.Set;
import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author DaniBoy
 */
@Entity
public class Customer implements Serializable{
    
    private int customerId;
    private String name;
    private String passportNo;
    private String country;
    private String address;
    private String phone;
    private String email;
    
    public Customer(int customerId, String name, String passportNo, String country, String address, String phone, String email) {
        this.customerId = customerId;
        this.name = name;
        this.passportNo = passportNo;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Customer(String name, String passportNo, String country, String address, String phone, String email) {
        this.name = name;
        this.passportNo = passportNo;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Customer() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
}
