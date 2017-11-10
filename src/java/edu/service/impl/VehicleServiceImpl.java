/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.service.impl;

import edu.dao.VehicleDao;
import edu.model.Vehicle;
import edu.service.VehicleService;
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
public class VehicleServiceImpl implements VehicleService{
@Autowired
VehicleDao vehicleDao;

    @Override
    public int addNewVehicle(Vehicle vehicle) {
        System.out.println("Service");
        vehicleDao.addNewVehicle(vehicle);
        return 1;
    }

    @Override
    public int removeVehicle(int id) {
        int res=vehicleDao.removeVehicle(id);
        return res;
    }

    @Override
    public List<Vehicle> searchVehicle(String name, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehicle> viewAllVehicle() {
        List<Vehicle> vehicleList=vehicleDao.viewAllVehicle();
        return vehicleList;
    }

    @Override
    public int updateVehicleDetail(Vehicle vehicle) {
        System.out.println("dao");
        int res=vehicleDao.updateVehicleDetail(vehicle);
        return res;
    }

    
}
