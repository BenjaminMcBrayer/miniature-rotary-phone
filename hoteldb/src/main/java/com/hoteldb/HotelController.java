package com.hoteldb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hoteldb.entity.Hotel;
import com.hoteldb.repo.HotelsRepository;

@Controller
public class HotelController {
	
	@Autowired
	HotelsRepository hotRep;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "cities", hotRep.findDistinctCity());
	}

	@RequestMapping("/city/{city}/hotlist")
	public ModelAndView hotList(@PathVariable("city") String city) {
		List<Hotel> hotels = new ArrayList<>();
		hotels = hotRep.findByCity(city);
		List<Hotel> sortedHotels = Hotel.sortByPricePerNightDescending(hotels);
		for (Hotel hotel : sortedHotels) {
			System.out.println(hotel);
		}
		return new ModelAndView("hotel-list", "sortedHotels", sortedHotels);
	}
}
