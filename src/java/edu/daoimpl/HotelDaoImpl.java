/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.daoimpl;

import edu.dao.HotelDao;
import edu.model.Hotel;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author DaniBoy
 */
@Component
public class HotelDaoImpl implements HotelDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public int removeHotel(int id) {
        Hotel hotel = (Hotel) sessionFactory.getCurrentSession().load(Hotel.class, new Integer(id));
        sessionFactory.getCurrentSession().delete(hotel);
        return 1;
    }

    @Override
    public List<Hotel> searchHotelHotel(String name, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateHotelDetail(Hotel hotel,int id) {
         sessionFactory.getCurrentSession().update(hotel);
         return 1;
    }

    @Override
    public int addNewHotel(Hotel hotel) {
        sessionFactory.getCurrentSession().save(hotel);
        return 1;
    }

    @Override
    public List<Hotel> viewAllHotel() {
        String sql = "select * from hotel";
        Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);
        List<Hotel> listHotel = query.list();
        return listHotel;
    }

   

}
