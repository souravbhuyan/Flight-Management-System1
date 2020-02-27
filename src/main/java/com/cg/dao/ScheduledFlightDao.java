package com.cg.dao;

import java.util.List;

import com.cg.dao.ScheduledFlightDaoImpl.AvailabilityException;
import com.cg.dao.ScheduledFlightDaoImpl.FlightException;
import com.cg.dao.ScheduledFlightDaoImpl.dateTimeException;


//import com.capg.sprint1.fms.model.ScheduledFlight;

public interface ScheduledFlightDao {
	public void addDetails();

	public boolean checkAvailableSeats(String fId,int numberOfSeats,String source,String destination) throws FlightException;
	public boolean checkFlight(String availableFlight) throws AvailabilityException;
	public boolean checkDateTime(String dateTime,String arr[]) throws dateTimeException;
}
