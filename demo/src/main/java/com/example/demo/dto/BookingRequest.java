package com.example.demo.dto;

import java.math.BigInteger;
import java.util.Date;

public class BookingRequest {
	
	    private BigInteger id;
	    
	    private BigInteger showid;
	    
	    private String seats;
	    
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
	    
	  

}
