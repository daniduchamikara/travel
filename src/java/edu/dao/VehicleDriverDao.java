/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.dao;

import edu.model.VehicleDriver;
import java.util.List;

/**
 *
 * @author DaniBoy
 */
public interface VehicleDriverDao {

    public int addNewVehicleDriver(VehicleDriver vehicleDriver);

    public int removeVehicleDriver(int id);

    public List<VehicleDriver> searchVehicle(String name, int id);

    public List<VehicleDriver> viewAllVehicleDrivers();

    public int updateVehicleDriverDetail(VehicleDriver vehicleDriver);
}
