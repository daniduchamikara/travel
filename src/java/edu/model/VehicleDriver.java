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
public class VehicleDriver {
    private int driverId;
    private String dName;
    private String dLicense;
    private String dLicenseCat;
    private String phone;
    private double salary;

    public VehicleDriver() {
    }

    public VehicleDriver(int driverId, String dName, String dLicense, String dLicenseCat, String phone, double salary) {
        this.driverId = driverId;
        this.dName = dName;
        this.dLicense = dLicense;
        this.dLicenseCat = dLicenseCat;
        this.phone = phone;
        this.salary = salary;
    }

    public VehicleDriver(String dName, String dLicense, String dLicenseCat, String phone, double salary) {
        this.dName = dName;
        this.dLicense = dLicense;
        this.dLicenseCat = dLicenseCat;
        this.phone = phone;
        this.salary = salary;
    }
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdLicense() {
        return dLicense;
    }

    public void setdLicense(String dLicense) {
        this.dLicense = dLicense;
    }

    public String getdLicenseCat() {
        return dLicenseCat;
    }

    public void setdLicenseCat(String dLicenseCat) {
        this.dLicenseCat = dLicenseCat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    

}
