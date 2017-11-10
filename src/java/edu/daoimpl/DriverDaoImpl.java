/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.daoimpl;

import edu.dao.DriverDao;
import edu.model.VehicleDriver;
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
public class DriverDaoImpl implements DriverDao{
 @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public int addNewDriver(VehicleDriver driver) {
        sessionFactory.getCurrentSession().save(driver);
        return 1;
    }

    @Override
    public int removeDriver(int id) {
         VehicleDriver driver = (VehicleDriver) sessionFactory.getCurrentSession().load(VehicleDriver.class, new Integer(id));
        sessionFactory.getCurrentSession().delete(driver);
        return 1;
    }

    @Override
    public List<VehicleDriver> searchDriver(String name, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VehicleDriver> viewAllDriver() {
        String sql = "select * from vehicledriver";
        Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);
        List<VehicleDriver> listVehicleDriver = query.list();
        System.out.println(query.list());
        return listVehicleDriver;
    }

    @Override
    public int updateDriverDetail(VehicleDriver driver) {
         sessionFactory.getCurrentSession().update(driver);
         return 1;
    }

  
}
