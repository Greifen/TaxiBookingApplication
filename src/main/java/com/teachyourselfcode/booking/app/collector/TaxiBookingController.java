package com.teachyourselfcode.booking.app.collector;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping(value="/")
	public String getPage() {
		return "hallo";
	}
	
	@PostMapping(value="/createbooking")
	public Taxi createBooking(@RequestBody Taxi taxi) {
		return taxiBookingService.createBooking(taxi);
	}
	
	@GetMapping(value="/getbooking/{bookingId}")
	public Optional<Taxi> getBooking(@PathVariable("bookingId") Integer bookingId) {
		return taxiBookingService.getBooking(bookingId);
	}
	
	@GetMapping(value="/getallbookings")
	public Iterable<Taxi> getAllBookings() {
		return taxiBookingService.getAllBookings();
	}
	
	@DeleteMapping(value="/deletebooking/{bookingId}")
	public void deleteBooking(@PathVariable("bookingId") Integer bookingId) {
	    taxiBookingService.deleteBooking(bookingId);
	}
	
	@PutMapping(value="/updatebooking")
	public Taxi updateBooking(@RequestBody Taxi taxi) {
		return taxiBookingService.createBooking(taxi);
	}
}
