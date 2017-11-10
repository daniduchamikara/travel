/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.service;

import edu.model.User;
import java.util.List;

/**
 *
 * @author DaniBoy
 */
public interface UserService {

    public int addNewUser(User user);

    public int removeUser(int id);

    public List<User> searchUser(String name, int id);

    public List<User> viewAllUser();

    public int updateUserDetail(User user);
    
    public boolean login(User user);
}
