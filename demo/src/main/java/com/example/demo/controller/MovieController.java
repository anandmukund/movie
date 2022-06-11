package com.example.demo.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.BookingRequest;
import com.example.demo.dto.MovieRequest;
import com.example.demo.dto.ShowdetailsRequest;
import com.example.demo.dto.TheaterRequest;
import com.example.demo.entity.Booking;
import com.example.demo.entity.Movie;
import com.example.demo.entity.Showdetails;
import com.example.demo.entity.Theater;
import com.example.demo.services.MovieServices;

@RequestMapping("movie")

@org.springframework.web.bind.annotation.RestController
public class MovieController {

	@Autowired
	MovieServices movieServices;

	@GetMapping("/seat/{showId}")
	public int getSeatAvibility(@PathVariable BigInteger showId) {
		
		return movieServices.getSeatAvibility(showId);
	}

	@PostMapping("/theater")
	public Theater onboardTheater(@RequestBody TheaterRequest theaterRequest) {
		
		return movieServices.onboardTheater(theaterRequest);
	}
	
	@PutMapping("/theater")
	public Theater updateTheater(@RequestBody TheaterRequest theaterRequest) {
		
		return movieServices.updateTheater(theaterRequest);
	}
	
	@DeleteMapping("/theater/{theaterId}")
	public Theater deleteTheater(@PathVariable BigInteger theaterId) {
		
		return movieServices.deleteTheater(theaterId);
	}

	@PostMapping("/movies")
	public Movie onboardMovies(@RequestBody MovieRequest movieRequest) {
		return movieServices.onboardMovies(movieRequest);
	}
	
	@PostMapping("/moviesbook")
	public Booking bookMovies(@RequestBody BookingRequest bookingRequest) {
		return movieServices.bookMovies(bookingRequest);
	}
	
	@DeleteMapping("/moviesbook/{bookingId}")
	public Booking cancleMovies(@PathVariable BigInteger bookingId) {
		return movieServices.cancleBooking(bookingId);
	}

	@PostMapping("/map")
	public List<Showdetails> mapShow(@RequestBody List<ShowdetailsRequest> showdetailsRequests) {
		return movieServices.mapShow(showdetailsRequests);
	}
}
