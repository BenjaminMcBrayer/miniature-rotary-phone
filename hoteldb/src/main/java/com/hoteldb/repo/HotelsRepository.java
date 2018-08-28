package com.hoteldb.repo;

import java.util.List;
import java.util.TreeSet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hoteldb.entity.Hotel;

@Repository
public interface HotelsRepository extends JpaRepository<Hotel, Long>{

	@Query("SELECT DISTINCT city FROM Hotel")
	TreeSet<String> findDistinctCity();
	
	List<Hotel> findByCity(String city);
}
