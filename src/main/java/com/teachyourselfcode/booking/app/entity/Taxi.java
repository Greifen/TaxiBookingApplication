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
	private Integer passengerName;
	
	@Column(name="passenger_num")
	private Integer passengerNumber;
	
	@Column(name="passenger_email")
	private Integer passengerEmail;
	
	public Integer getTaxiBookingId() {
		return taxiBookingId;
	}

	public void setTaxiBookingId(Integer taxiBookingId) {
		this.taxiBookingId = taxiBookingId;
	}

	public Integer getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(Integer passengerName) {
		this.passengerName = passengerName;
	}

	public Integer getPassengerNumber() {
		return passengerNumber;
	}

	public void setPassengerNumber(Integer passengerNumber) {
		this.passengerNumber = passengerNumber;
	}

	public Integer getPassengerEmail() {
		return passengerEmail;
	}

	public void setPassengerEmail(Integer passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

}
