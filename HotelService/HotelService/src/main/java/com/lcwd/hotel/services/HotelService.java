package com.lcwd.hotel.services;

import com.lcwd.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    //Create
    Hotel create(Hotel hotel);

    //Get All
    List<Hotel> getAll();

    //Get By  Id
    Hotel get(String id);
}
