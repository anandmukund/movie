package com.example.demo.repository;

import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Showdetails;

public interface ShowdetailsRepository extends JpaRepository<Showdetails,BigInteger> {
	
}