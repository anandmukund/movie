package com.example.demo.dto;

import java.math.BigInteger;
import java.util.Date;
public class MovieRequest {
	
	  
	    private BigInteger id;
	 
	    private String name;
	    
	    private String language;
	    
	    private int duration;
	    
	    private Date date;

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

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}
	    
	    

}
