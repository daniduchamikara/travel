/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.controller;

import edu.model.User;
import edu.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author DaniBoy
 */
@Transactional
@Controller
public class UserController {
    @Autowired
    UserService service;
    
    
    @RequestMapping(value = "/adduser",method = RequestMethod.GET)
    public String toAddUser(){
        return "addnewuser";
    }
    
    @RequestMapping(value = "/viewallusers", method = RequestMethod.GET)
    public String viewAllVehicleLoad(){
        return "viewusers";
    }
    
    
    @RequestMapping(value = "/addusr",method = RequestMethod.POST)
    public String addNewUser(@RequestParam(value = "username")String usrName,@RequestParam(value = "password")String password,@RequestParam(value = "type")String userType){
        User user=new User(usrName, password, userType);
        service.addNewUser(user);
        return "addnewuser";
    }
    
    @RequestMapping(value = "/deleteusr")
    public String deleteUser(@RequestParam(value = "id")String id){
        int userId=Integer.parseInt(id);
        int res=service.removeUser(userId);
        return "viewusers";
    }
    @RequestMapping(value = "/viewallusers")
    public ModelAndView viewAllUsers(ModelAndView mav){
        List<User> listUser=service.viewAllUser();
        mav.addObject("ulist",listUser);
        mav.setViewName("home");
        return mav;
    }
    @RequestMapping(value = "/updateusr",method = RequestMethod.POST)
    public String updateUser(@RequestParam(value = "userid")String id,@RequestParam(value = "username")String usrName,@RequestParam(value = "password")String password,@RequestParam(value = "type")String userType){
        int userId=Integer.parseInt(id);
        User user=new User(userId, usrName, password, userType);
        int res=service.updateUserDetail(user);
        return "viewusers";
    }
    
    @RequestMapping(value = "/updateiduser")
    public ModelAndView updateidDirectvehicle(ModelAndView mav,@RequestParam(value = "id")String id){
        mav.addObject("uid",id);
        mav.setViewName("updateuser");
        return mav;
    } 
    
    @RequestMapping(value = "loginprecess")
    public String login(@RequestParam(value = "username")String user,@RequestParam(value = "password")String pass){
        User user1=new User(user, pass);
        boolean res=service.login(user1);
        if (res==true) {
            return "index";
        }
        return "login";
    }
}
