package com.lcwd.rating.services;

import com.lcwd.rating.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    //create
    Rating create (Rating rating);

    //Get Ratings
    List<Rating> getRating();

    //Get Ratings by user
    List<Rating> getRatingByUserId(String userId);

    //Get ratings by hotel
    List<Rating> getRatingByHotelId(String hotelId);
}
