/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.daoimpl;

import edu.dao.TripDao;
import edu.model.Booking;
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
public class TripDaoImpl implements TripDao{

    @Autowired
    private SessionFactory sessionFactory;

    
    @Override
    public int addNewTrip(Booking booking) {
        sessionFactory.getCurrentSession().save(booking);
        return 1;
    }

    @Override
    public int removeTrip(int id) {
        sessionFactory.getCurrentSession().delete(id);
        return 1;
    }

    @Override
    public int updatetrip(int id, double amount) {
        System.out.println(String.valueOf(amount));
        System.out.println(String.valueOf(id));
        String sql = "UPDATE booking SET dueAmount='"+amount+"' WHERE tripid='"+id+"'";
        Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);
        query.executeUpdate();
        
        return 1;
    }
    
}
