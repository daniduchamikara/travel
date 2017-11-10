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
public class Vehicle implements Serializable{
    
    private int vId;
    private String vName;
    private String vPlate;
    private String vType;
    private String vModel;
    private String ac;
    private String vYear;
    private double vFee;

    public Vehicle(int vId, String vName, String vPlate, String vType, String vModel, String ac, String vYear, double vFee) {
        this.vId = vId;
        this.vName = vName;
        this.vPlate = vPlate;
        this.vType = vType;
        this.vModel = vModel;
        this.ac = ac;
        this.vYear = vYear;
        this.vFee = vFee;
    }

    public Vehicle(String vName, String vPlate, String vType, String vModel, String ac, String vYear, double vFee) {
        this.vName = vName;
        this.vPlate = vPlate;
        this.vType = vType;
        this.vModel = vModel;
        this.ac = ac;
        this.vYear = vYear;
        this.vFee = vFee;
    }

    public Vehicle() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getvId() {
        return vId;
    }

    public void setvId(int vId) {
        this.vId = vId;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public String getvPlate() {
        return vPlate;
    }

    public void setvPlate(String vPlate) {
        this.vPlate = vPlate;
    }

    public String getvType() {
        return vType;
    }

    public void setvType(String vType) {
        this.vType = vType;
    }

    public String getvModel() {
        return vModel;
    }

    public void setvModel(String vModel) {
        this.vModel = vModel;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getvYear() {
        return vYear;
    }

    public void setvYear(String vYear) {
        this.vYear = vYear;
    }

    public double getvFee() {
        return vFee;
    }

    public void setvFee(double vFee) {
        this.vFee = vFee;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "vId=" + vId + ", vName=" + vName + ", vPlate=" + vPlate + ", vType=" + vType + ", vModel=" + vModel + ", ac=" + ac + ", vYear=" + vYear + ", vFee=" + vFee + '}';
    }

   
}
