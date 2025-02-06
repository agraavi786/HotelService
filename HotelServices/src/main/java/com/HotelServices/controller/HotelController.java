package com.HotelServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HotelServices.Entities.Hotel;
import com.HotelServices.Services.Services;

@RestController
@RequestMapping("/Hotels")
public class HotelController {

	@Autowired
	Services ser;

	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {

		Hotel create = ser.create(hotel);

		return ResponseEntity.status(HttpStatus.CREATED).body(create);

	}

	@GetMapping
	public ResponseEntity<List<Hotel>> getAll() {
		List<Hotel> hotel = ser.getHotel();

		return ResponseEntity.ok(hotel);
	}

	public ResponseEntity<Hotel> getSingle(@PathVariable String id) {
		Hotel singleHotel = ser.getSingleHotel(id);

		return ResponseEntity.ok(singleHotel);
	}

}
