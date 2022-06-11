package com.example.demo.dto;

import java.math.BigInteger;
import java.util.Date;

public class TheaterRequest {
	
	   
	    private BigInteger id;
	 
	    private String name;
	    
	    private int capacity;
	    
	    private String city;
	    
	    private String location;
	    
	    private Date date;
	    
	    private boolean status;

		public BigInteger getId() {
			return id;
		}

		public void setId(BigInteger id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}
	    
	    

}
