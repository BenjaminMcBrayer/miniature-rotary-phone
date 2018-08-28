package com.hoteldb;

import java.util.Comparator;

import com.hoteldb.entity.Hotel;

public class HotelPriceComparator implements Comparator<Hotel> {
	@Override
	public int compare(Hotel one, Hotel other) {
		Integer onePricePerNight = Integer.parseInt(one.getPricePerNight()); 
		Integer otherPricePerNight = Integer.parseInt(other.getPricePerNight());
		return onePricePerNight.compareTo(otherPricePerNight);
	}
}