package com.example.demo.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.dto.BookingRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Booking {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO )
	    private BigInteger id;
	    
	    private BigInteger showid;
	    
	    private String seats ;
	    
	    private int seatcount;
	    
	    private Date date ;
	    
	    private int status;

		public BigInteger getId() {
			return id;
		}

		public void setId(BigInteger id) {
			this.id = id;
		}

		public BigInteger getShowid() {
			return showid;
		}

		public void setShowid(BigInteger showid) {
			this.showid = showid;
		}

		
		public String getSeats() {
			return seats;
		}

		public void setSeats(String seats) {
			this.seats = seats;
		}

		public int getSeatcount() {
			return seatcount;
		}

		public void setSeatcount(int seatcount) {
			this.seatcount = seatcount;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}
	    
		
		  public static Booking of(BookingRequest rqst) {
		    	
		    	Booking booking = new Booking();
		    	booking.setDate(new Date());
		    	booking.setSeatcount(rqst.getSeatcount());
		    	booking.setSeats(rqst.getSeats());
		    	booking.setShowid(rqst.getShowid());
		    	booking.setStatus(1);
		    	return booking;
		    }
	    

}
