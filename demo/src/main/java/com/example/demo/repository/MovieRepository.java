package com.example.demo.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,BigInteger> {
	
	public List<Movie> findByLanguage(String language);
	public List<Movie> findByName(String name);
	public  Movie findByNameAndLanguage(String name , String language);
	
}