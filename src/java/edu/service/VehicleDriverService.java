/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.service;

import edu.model.VehicleDriver;
import java.util.List;

/**
 *
 * @author DaniBoy
 */
public interface VehicleDriverService {

    public int addNewVehicleDriver(VehicleDriver driver);

    public int removeVehicleDriver(int id);

    public List<VehicleDriver> searchVehicleDriver(String name, int id);

    public List<VehicleDriver> viewAllVehicleDriver();

    public int updateCustomerDetail(VehicleDriver driver);
}
