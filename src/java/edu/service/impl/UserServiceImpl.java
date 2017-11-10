/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.service.impl;

import edu.dao.UserDao;
import edu.model.User;
import edu.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DaniBoy
 */
@Component
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public int addNewUser(User user) {
        userDao.addNewUser(user);
        return 1;
    }

    @Override
    public int removeUser(int id) {
        int res = userDao.removeUser(id);
        return res;
    }

    @Override
    public List<User> searchUser(String name, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> viewAllUser() {
        List<User> usersList = userDao.viewAllUser();
        return usersList;
    }

    @Override
    public int updateUserDetail(User user) {
        int res = userDao.updateUserDetail(user);
        return res;
    }

    @Override
    public boolean login(User user) {
        boolean res = false;
        res = userDao.login(user);
        return res;
    }

}
