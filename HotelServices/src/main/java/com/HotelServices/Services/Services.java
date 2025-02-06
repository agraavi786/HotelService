package com.HotelServices.Services;

import java.util.List;

import com.HotelServices.Entities.Hotel;

public interface Services {
	
	 Hotel create(Hotel hotel);
	
	 List<Hotel> getHotel();
	
	 Hotel getSingleHotel(String hId);
	

}
