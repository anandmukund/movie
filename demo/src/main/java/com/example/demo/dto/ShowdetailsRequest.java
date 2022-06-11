package com.example.demo.dto;

import java.math.BigInteger;
import java.util.Date;


public class ShowdetailsRequest {
	
	    private BigInteger id;
	    
	    private BigInteger thid;
	    
	    private BigInteger mvid;
	    
	    private int showshr;
	    
	    private int showsmn;
	    
        private int showehr;
	    
	    private int showemn;
	    
	    private Date date;
	    
	    private boolean status;

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

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}
	    
	    
	    

}
