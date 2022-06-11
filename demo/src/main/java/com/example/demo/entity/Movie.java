package com.example.demo.entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.dto.MovieRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Movie {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO )
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
	    
	    
		 public static Movie of(MovieRequest rqst) {
			 Movie movie = new Movie();
			 movie.setDate(new Date());
			 movie.setDuration(rqst.getDuration());
			 movie.setLanguage(rqst.getLanguage());
			 movie.setName(rqst.getName());
		     return movie;
		    }

}
