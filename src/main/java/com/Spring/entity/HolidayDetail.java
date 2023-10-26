package com.Spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name="holidaydetail")
public class HolidayDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
		@Column(name = "date")
		long date;
		
		String reason;
		
		public long getDate() {
			return date;
		}
		public void setDate(long date) {
			
			this.date = date;
		}
		public String getReason() {
			return reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}

}
