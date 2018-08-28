package com.hoteldb.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hoteldb.HotelPriceComparator;

@Entity
@Table(name = "hotel_listing")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hotel_id")
	private Long id;
	@Column(name = "hotel_name")
	private String name;
	@Column(name = "city")
	private String city;
	@Column(name = "price_per_night")
	private String pricePerNight;
	
	public static List<Hotel> sortByPricePerNightDescending(List<Hotel> unsortedHotels) {
		Collections.sort(unsortedHotels, new HotelPriceComparator());
		List<Hotel> sortedHotels = new ArrayList<>();
		for (int i = unsortedHotels.size() - 1; i >= 0; --i) {
			sortedHotels.add(unsortedHotels.get(i));
		}
		return sortedHotels;
	}
	
	public Hotel() {
		id = (long) 0;
		name = "";
		city = "";
		pricePerNight = "";
	}

	public Hotel(Long id, String name, String city, String pricePerNight) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(String pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", city=" + city + ", pricePerNight=" + pricePerNight + "]";
	}
}

