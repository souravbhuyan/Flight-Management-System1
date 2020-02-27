package com.cg.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.cg.dto.ScheduledFlight;

public  class ScheduledFlightDaoImpl implements ScheduledFlightDao {
	
	Map<String,ScheduledFlight> seats=new HashMap<String,ScheduledFlight>();
	Map<String,ScheduledFlight> flightsLists=new HashMap<String,ScheduledFlight>();
	
	public void addDetails() {
		ScheduledFlight customer1=new ScheduledFlight(5,"10abc","31-01-2020","MUM","BAN");
		ScheduledFlight customer2=new ScheduledFlight(6,"11def","08-09-2020","HYD","BBS");
		ScheduledFlight customer3=new ScheduledFlight(6,"12ght","06-09-2020","KOL","CHD");
		seats.put(customer1.getFlight(), customer1);
		seats.put(customer2.getFlight(), customer2);
		seats.put(customer3.getFlight(), customer3);
		
	}

//	public boolean checkAvailableSeats(String fId,int numberOfSeats) throws FlightException{
//		// TODO Auto-generated method stub
//		if(!(seats.get(fId).getAvailableSeats()<numberOfSeats))
//			throw new FlightException("The seats are not available");
//		return true;
//	}


	public boolean checkFlight(String availableFlight) throws AvailabilityException{
		// TODO Auto-generated method stub
		//System.out.println(availableFlight);
		if(seats.get(availableFlight)==null) 
		{
			throw new AvailabilityException("The flight is not available");
		}
		else
		{
			System.out.println("flight is available ");
		}return false;
	}

	public boolean checkDateTime(String dateTime,String arr[]) throws dateTimeException{
		// TODO Auto-generated method stub
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if(seats.get(arr[i]).getDateTime().equals(dateTime))flag=true;
		}
		if(flag==false)throw new dateTimeException("Flight is not available at that particulat date ");
		return true;
	}
	
	public class FlightException extends Exception {
		public FlightException(String message) {
			super(message);
		}
	}
	
	public class AvailabilityException extends Exception {
		public AvailabilityException(String string) {
			
		}
	}
	
	
	public class dateTimeException extends Exception {
		public dateTimeException(String time) {
			super(time);
		}
	}


	@Override
	public boolean checkAvailableSeats(String fId, int numberOfSeats, String source, String destination) throws FlightException {
		if(!(seats.get(fId).getAvailableSeats()>numberOfSeats))
			throw new FlightException("The seats are not available");
		return true;
	}

	public boolean checkAvailableSeats(int i, String string, String string2, String string3, String string4) {
		// TODO Auto-generated method stub
		return false;
	}

	

	
}
