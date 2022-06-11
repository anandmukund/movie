package com.example.demo.entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.dto.ShowdetailsRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Showdetails {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO )
	    private BigInteger id;
	    
	    private BigInteger thid;
	    
	    private BigInteger mvid;
	    
	    private int showshr;
	    
	    private int showsmn;
	    
        private int showehr;
	    
	    private int showemn;
	    
	    private Date date;
	    
	    private int status;

		public BigInteger getId() {
			return id;
		}

		public void setId(BigInteger id) {
			this.id = id;
		}

		public BigInteger getThid() {
			return thid;
		}

		public void setThid(BigInteger thid) {
			this.thid = thid;
		}

		public BigInteger getMvid() {
			return mvid;
		}

		public void setMvid(BigInteger mvid) {
			this.mvid = mvid;
		}

		public int getShowshr() {
			return showshr;
		}

		public void setShowshr(int showshr) {
			this.showshr = showshr;
		}

		public int getShowsmn() {
			return showsmn;
		}

		public void setShowsmn(int showsmn) {
			this.showsmn = showsmn;
		}

		public int getShowehr() {
			return showehr;
		}

		public void setShowehr(int showehr) {
			this.showehr = showehr;
		}

		public int getShowemn() {
			return showemn;
		}

		public void setShowemn(int showemn) {
			this.showemn = showemn;
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

		
	    public static Showdetails of(ShowdetailsRequest rqst) {
	    	Showdetails showdetails = new Showdetails();
	    	showdetails.setDate(new Date());
	    	showdetails.setMvid(rqst.getMvid());
	    	showdetails.setShowehr(rqst.getShowehr());
	    	showdetails.setShowemn(rqst.getShowemn());
	    	showdetails.setShowshr(rqst.getShowshr());
	    	showdetails.setShowsmn(rqst.getShowsmn());
	    	showdetails.setStatus(1);
	    	showdetails.setThid(rqst.getThid());
	    	
	    	return showdetails;
	    }
	    

}
