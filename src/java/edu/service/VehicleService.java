/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.service;

import edu.model.Vehicle;
import java.util.List;

/**
 *
 * @author DaniBoy
 */
public interface VehicleService {

    public int addNewVehicle(Vehicle vehicle);

    public int removeVehicle(int id);

    public List<Vehicle> searchVehicle(String name, int id);

    public List<Vehicle> viewAllVehicle();

    public int updateVehicleDetail(Vehicle vehicle);
}
