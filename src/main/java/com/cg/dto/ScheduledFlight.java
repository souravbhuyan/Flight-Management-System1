package com.cg.dto;

public class ScheduledFlight {
	
	private int availableSeats;
	private String flight;
	private String dateTime;
	private String source;
	private String destination;
	
	public ScheduledFlight() {
		// TODO Auto-generated constructor stub
		super();
	}

	public ScheduledFlight(int availableSeats, String flight,String i,String source,String destination) {
		super();
		this.availableSeats = availableSeats;
		this.flight = flight;
		this.dateTime = i;
		this.source=source;
		this.destination=destination;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public String getFlight() {
		return flight;
	}

	public void setFlight(String flight) {
		this.flight = flight;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String setSource(String source) {
		return source;
	}

	public String getSource(String source) {
		return this.source=source;
	}

	
	@Override
	public String toString() {
		return "ScheduledFlight [availableSeats=" + availableSeats + ", flight=" + flight + ", dateTime=" + dateTime
				+ "]";
	}
	
}
