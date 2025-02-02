  package com.teachyourselfcode.booking.app.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.teachyourselfcode.booking.app.entity.Taxi;

@Repository
public interface TaxiBookingDao extends CrudRepository<Taxi, Integer> {

}
