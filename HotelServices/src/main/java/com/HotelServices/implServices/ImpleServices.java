package com.HotelServices.implServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HotelServices.Entities.Hotel;
import com.HotelServices.Services.Services;
import com.HotelServices.repostitory.HotelRepository;


@Service
public class ImpleServices implements Services{
	
	@Autowired
	HotelRepository hr;

	@Override
	public Hotel create(Hotel hotel) {
		
		return hr.save(hotel);
	}

	@Override
	public List<Hotel> getHotel() {
		return hr.findAll();
	}

	
	public Hotel getSingleHotel(String hId) {
		return hr.findById(hId).orElseThrow(null);
	}

}
