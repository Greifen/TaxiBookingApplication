package com.teachyourselfcode.booking.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachyourselfcode.booking.app.Dao.TaxiBookingDao;
import com.teachyourselfcode.booking.app.entity.Taxi;

@Service
public class TaxiBookingService {

	@Autowired
	TaxiBookingDao taxiBookingDao;
	
	public Taxi createBooking(Taxi taxi) {
		return taxiBookingDao.save(taxi);
	}

}
