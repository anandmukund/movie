package com.example.demo.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.BookingRequest;
import com.example.demo.dto.MovieRequest;
import com.example.demo.dto.ShowdetailsRequest;
import com.example.demo.dto.TheaterRequest;
import com.example.demo.entity.Booking;
import com.example.demo.entity.Movie;
import com.example.demo.entity.Showdetails;
import com.example.demo.entity.Theater;
import com.example.demo.repository.BookingRepository;
import com.example.demo.repository.MovieRepository;
import com.example.demo.repository.ShowdetailsRepository;
import com.example.demo.repository.TheaterRepository;


@Service
public class MovieServices {

	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private ShowdetailsRepository showdetailsRepository;
	
	@Autowired
	private TheaterRepository theaterRepository;

	public int getSeatAvibility( BigInteger showId) {
		Showdetails showdetails = showdetailsRepository.getById(showId);
		List<Booking> allBookings = bookingRepository.findByShowid(showId);
		 int count = 0;
		 for(Booking booking : allBookings) {
			 count = count + booking.getSeatcount();
		 }
		Theater theater = theaterRepository.getById(showdetails.getThid());
		 int result = theater.getCapacity() - count;
		 
		return result;
	}

	public Theater onboardTheater(TheaterRequest theaterRequest) {
		Theater theater = Theater.of(theaterRequest);
		return theaterRepository.save(theater);
	}
	
	public Theater updateTheater( TheaterRequest theaterRequest) {
		Theater theater = Theater.of(theaterRequest);
		return theaterRepository.save(theater);
	}
	
	public Theater deleteTheater( BigInteger theaterId) {
		Theater theater = theaterRepository.getById(theaterId);
		theater.setStatus(0);
		return theaterRepository.save(theater);
	}

	public Movie onboardMovies( MovieRequest movieRequest) {
		Movie movie = Movie.of(movieRequest);
		return movieRepository.save(movie);
	}
	
	public Booking bookMovies( BookingRequest bookingRequest) {
		Booking booking = Booking.of(bookingRequest);
		return bookingRepository.save(booking);
	}

	public Booking cancleBooking(BigInteger bookingId) {
		Booking booking = bookingRepository.getById(bookingId);
		booking.setStatus(0);
		return bookingRepository.save(booking);
	}
	
	public List<Showdetails> mapShow(List<ShowdetailsRequest> showdetailsRequests) {
		List<Showdetails> showdetails = new ArrayList<Showdetails>();
		for(ShowdetailsRequest show : showdetailsRequests) {
		Showdetails showdetail = Showdetails.of(show);
		showdetails.add(showdetailsRepository.save(showdetail));
		}
		return showdetails;
	}
}
	

