/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import sun.security.util.Password;

/**
 *
 * @author DaniBoy
 */
@Entity
public class User {
    private int userid;
    private String userName;
    private String password;
    private String type;

    public User() {
    }

    public User(int userid, String userName, String password, String type) {
        this.userid = userid;
        this.userName = userName;
        this.password = password;
        this.type = type;
    }

    public User(String userName, String password, String type) {
        this.userName = userName;
        this.password = password;
        this.type = type;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
