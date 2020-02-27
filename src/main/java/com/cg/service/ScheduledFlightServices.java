package com.cg.service;

import com.cg.dao.ScheduledFlightDaoImpl.AvailabilityException;
import com.cg.dao.ScheduledFlightDaoImpl.FlightException;
import com.cg.dao.ScheduledFlightDaoImpl.dateTimeException;

public interface ScheduledFlightServices {
	
	public boolean checkAvailableSeats(String fId,int numberOfSeats,String source,String destination) throws FlightException;
	public boolean checkFlight(String availableFlight) throws AvailabilityException;
	public boolean checkDateTime(String dateTime,String arr[]) throws dateTimeException;
	public void addDetails();
}
