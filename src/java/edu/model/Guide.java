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
public class Guide implements Serializable {
    private int guideId;
    private String gName;
    private String gLicenseNo;
    private String gLicenseType;
    private String phone;
    private double salary;

    public Guide() {
    }

    public Guide(int guideId, String gName, String gLicenseNo, String gLicenseType, String phone, double salary) {
        this.guideId = guideId;
        this.gName = gName;
        this.gLicenseNo = gLicenseNo;
        this.gLicenseType = gLicenseType;
        this.phone = phone;
        this.salary = salary;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getGuideId() {
        return guideId;
    }

    public void setGuideId(int guideId) {
        this.guideId = guideId;
    }

    public String getgLicenseNo() {
        return gLicenseNo;
    }

    public void setgLicenseNo(String gLicenseNo) {
        this.gLicenseNo = gLicenseNo;
    }

    public String getgLicenseType() {
        return gLicenseType;
    }

    public void setgLicenseType(String gLicenseType) {
        this.gLicenseType = gLicenseType;
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
