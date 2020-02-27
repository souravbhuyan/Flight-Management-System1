package com.cg.service;

import com.cg.dao.ScheduledFlightDao;
import com.cg.dao.ScheduledFlightDaoImpl;
import com.cg.dao.ScheduledFlightDaoImpl.AvailabilityException;
import com.cg.dao.ScheduledFlightDaoImpl.FlightException;
import com.cg.dao.ScheduledFlightDaoImpl.dateTimeException;

public class ScheduledFlightServicesImpl implements ScheduledFlightServices {
	
	 static ScheduledFlightDao service=new ScheduledFlightDaoImpl();

	public boolean checkAvailableSeats(String fId, int numberOfSeats) throws FlightException {
		String source = null;
		String destination = null;
		// TODO Auto-generated method stub
		return service.checkAvailableSeats(fId,numberOfSeats, source, destination);
	}

	public boolean checkFlight(String availableFlight) throws AvailabilityException {
		// TODO Auto-generated method stub
		return service.checkFlight(availableFlight);
	}

	public boolean checkDateTime(String dateTime,String arr[]) throws dateTimeException {
		// TODO Auto-generated method stub
		return service.checkDateTime(dateTime,arr);
	}
	
	public static boolean validateSeats(String Id,int numberOfSeats) {
		boolean flag=false;
		try {
			String source = null;
			String destination = null;
			if(!(service.checkAvailableSeats(Id,numberOfSeats, source, destination))) {
				return true;
			}
		} 
		catch (FlightException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	public void addDetails() {
		
		service.addDetails();
	}

	@Override
	public boolean checkAvailableSeats(String fId, int numberOfSeats, String source, String destination)
			throws FlightException {
		// TODO Auto-generated method stub
		return service.checkAvailableSeats(fId, numberOfSeats, source, destination);
	}
}
