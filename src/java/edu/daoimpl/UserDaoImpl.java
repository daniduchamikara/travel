  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.daoimpl;

import edu.dao.UserDao;
import edu.model.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DaniBoy
 */
@Component
@Transactional
public class UserDaoImpl implements UserDao{
     @Autowired
    SessionFactory sessionFactory;

    @Override
    public int addNewUser(User user) {
         sessionFactory.getCurrentSession().save(user);
        return 1;
    }

    @Override
    public int removeUser(int id) {
        User user = (User) sessionFactory.getCurrentSession().load(User.class, new Integer(id));
        sessionFactory.getCurrentSession().delete(user);
        return 1;
    }

    @Override
    public List<User> searchUser(String name, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> viewAllUser() {
         String sql = "select * from user";
        Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);
        List<User> listUser = query.list();
        return listUser;
    }

    @Override
    public int updateUserDetail(User user) {
        sessionFactory.getCurrentSession().update(user);
         return 1;
    }

    @Override
    public boolean login(User user) {
        String name=user.getUserName();
        String pass=user.getPassword();
       String sql = "select * from user where username='"+name+"' and password='"+pass+"'";
      List<User> listUser= sessionFactory.getCurrentSession().createCriteria(User.class).list();
        if (listUser.size()>0) {
            return true;
        }
        return false;
    }
    
}
