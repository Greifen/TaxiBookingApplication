package com.teachyourselfcode.booking.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="taxiBooking")
public class Taxi {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="taxi_bookingId")
	private Integer taxiBookingId;

	@Column(name="passenger_name")
	private String passengerName;
	
	@Column(name="passenger_num")
	private Integer passengerNumber;
	
	@Column(name="passenger_email")
	private String passengerEmail;
	
	public Integer getTaxiBookingId() {
		return taxiBookingId;
	}

	public void setTaxiBookingId(Integer taxiBookingId) {
		this.taxiBookingId = taxiBookingId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Integer getPassengerNumber() {
		return passengerNumber;
	}

	public void setPassengerNumber(Integer passengerNumber) {
		this.passengerNumber = passengerNumber;
	}

	public String getPassengerEmail() {
		return passengerEmail;
	}

	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

}
