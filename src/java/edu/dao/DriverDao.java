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
public interface DriverDao {

    public int addNewDriver(VehicleDriver driver);

    public int removeDriver(int id);

    public List<VehicleDriver> searchDriver(String name, int id);

    public List<VehicleDriver> viewAllDriver();

    public int updateDriverDetail(VehicleDriver driver);
}
