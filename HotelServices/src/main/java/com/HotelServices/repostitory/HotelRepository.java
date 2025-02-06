package com.HotelServices.repostitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HotelServices.Entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
