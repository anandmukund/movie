package com.example.demo.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Theater;

public interface TheaterRepository extends JpaRepository<Theater,BigInteger> {
	
	public List<Theater> findByCity(String city);
	public List<Theater> findByCityAndLocation(String city , String location);
	public Theater findByCityAndLocationAndName(String city , String location,String name);
	
}