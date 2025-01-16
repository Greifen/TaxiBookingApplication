package com.teachyourselfcode.booking.app.collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teachyourselfcode.booking.app.Service.TaxiBookingService;
import com.teachyourselfcode.booking.app.entity.Taxi;

@RestController
@RequestMapping(value="/api/taxibooking")
public class TaxiBookingController {
	
	@Autowired
	TaxiBookingService taxiBookingService;
	
	@PostMapping(value="/createbooking")
	public Taxi createBooking(@RequestBody Taxi taxi) {
		return taxiBookingService.createBooking(taxi);
	}
}
