/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.service.impl;

import edu.dao.VehicleDriverDao;
import edu.model.VehicleDriver;
import java.util.List;
import edu.service.VehicleDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DaniBoy
 */
@Component
@Transactional
public class VehicleDriverServiceImpl implements VehicleDriverService {

    @Autowired
    VehicleDriverDao driverDao;

    @Override
    public int addNewVehicleDriver(VehicleDriver driver) {
        int res = driverDao.addNewVehicleDriver(driver);
        return res;
    }

    @Override
    public int removeVehicleDriver(int id) {
        int res = driverDao.removeVehicleDriver(id);
        return res;
    }

    @Override
    public List<VehicleDriver> searchVehicleDriver(String name, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VehicleDriver> viewAllVehicleDriver() {
        List<VehicleDriver> vehicleDriverList=driverDao.viewAllVehicleDrivers();
        return vehicleDriverList;

    }

    @Override
    public int updateCustomerDetail(VehicleDriver driver) {
        int res=driverDao.updateVehicleDriverDetail(driver);
        return res;
    }

}
