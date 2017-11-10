/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.daoimpl;

import edu.dao.VehicleDriverDao;
import edu.model.VehicleDriver;
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
public class VehicleDriverDaoImpl implements VehicleDriverDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public int addNewVehicleDriver(VehicleDriver vehicleDriver) {
        sessionFactory.getCurrentSession().save(vehicleDriver);
        return 1;
    }

    @Override
    public int removeVehicleDriver(int id) {
        VehicleDriver driver = (VehicleDriver) sessionFactory.getCurrentSession().load(VehicleDriver.class, new Integer(2));
        sessionFactory.getCurrentSession().delete(driver);
        return 1;
    }

    @Override
    public List<VehicleDriver> searchVehicle(String name, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VehicleDriver> viewAllVehicleDrivers() {
        String sql = "select * from vehicleDriver";
        Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);
        List<VehicleDriver> listVehicleDriver = query.list();
        System.out.println(query.list());
        return listVehicleDriver;
    }

    @Override
    public int updateVehicleDriverDetail(VehicleDriver vehicleDriver) {
        sessionFactory.getCurrentSession().update(vehicleDriver);
        return 1;
    }

}
