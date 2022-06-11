package com.example.demo.entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.dto.TheaterRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Theater {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO )
	    private BigInteger id;
	 
	    private String name;
	    
	    private int capacity;
	    
	    private String city;
	    
	    private String location;
	    
	    private Date date;
	    
	    private int status;

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

		
	    
	    public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public static Theater of(TheaterRequest rqst) {
	    	Theater theater = new Theater();
	    	theater.setCapacity(rqst.getCapacity());  
	    	theater.setCity(rqst.getCity());
	    	theater.setDate(new Date());
	    	theater.setLocation(rqst.getLocation());
	    	theater.setName(rqst.getName());
	    	theater.setStatus(1);
	    	
	    	return theater;
	    }

}
