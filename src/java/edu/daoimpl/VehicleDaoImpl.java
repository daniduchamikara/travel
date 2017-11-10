/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.daoimpl;

import edu.dao.VehicleDao;
import edu.model.Vehicle;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
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
public class VehicleDaoImpl implements VehicleDao{

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public int addNewVehicle(Vehicle vehicle) {
        System.out.println("Dao");
        sessionFactory.getCurrentSession().save(vehicle);
        return 1;
    }

    @Override
    public int removeVehicle(int id) {
        System.out.println("Dao");
        Vehicle vehicle = (Vehicle) sessionFactory.getCurrentSession().load(Vehicle.class, new Integer(id));
        sessionFactory.getCurrentSession().delete(vehicle);
        return 1;
    }

    @Override
    public List<Vehicle> searchVehicle(String name, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List viewAllVehicle() {
        String sql = "select * from vehicle";
        Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);
        List<Vehicle> listVehicle = query.list();
        System.out.println(query.list());
        return listVehicle;
    }
    
     public List getAllCountries() {
      Session session = this.sessionFactory.getCurrentSession();
        List countryList = session.createQuery("from Country").list();
        return countryList;
 }

    @Override
    public int updateVehicleDetail(Vehicle vehicle) {
         sessionFactory.getCurrentSession().update(vehicle);
         return 1;
    }
    
}
