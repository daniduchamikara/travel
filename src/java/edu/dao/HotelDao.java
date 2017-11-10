/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.dao;
import edu.model.Hotel;
import java.util.List;

/**
 *
 * @author DaniBoy
 */
public interface HotelDao {
    public int addNewHotel(Hotel hotel);
    public int removeHotel(int id);
    public List<Hotel> searchHotelHotel(String name,int id);
    public List<Hotel> viewAllHotel();
    public int updateHotelDetail(Hotel hotel,int id);
}
