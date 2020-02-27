package com.cg.util;

import java.util.Scanner;

import com.cg.dao.ScheduledFlightDaoImpl.AvailabilityException;
import com.cg.dao.ScheduledFlightDaoImpl.FlightException;
import com.cg.dao.ScheduledFlightDaoImpl.dateTimeException;
import com.cg.service.ScheduledFlightServices;
import com.cg.service.ScheduledFlightServicesImpl;

public class Source {
	static Scanner in=new Scanner(System.in);
	static ScheduledFlightServices user=new ScheduledFlightServicesImpl();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

	public static void check() {
		while(true) {
			System.out.println("Check the availability details by the below methods");
			System.out.println("1. Seats Availability");
			System.out.println("2. Flight");
			System.out.println("3. Date and Time");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			int choice=in.nextInt();
			
			switch(choice) {
			case 1: 
				seats();
				break;
			case 2:
				flight();
				break;
			case 3:
				dt();
				break;
			case 4:
				System.out.println("Thank you");
				System.exit(0);
				break;
			default:
				System.err.println("Invalid Choice");
		}
		}

}

	
	public static void seats() {
		// TODO Auto-generated method stub
		user.addDetails();	
		System.out.println("Enter the flight ID");
		String fId=in.next();
		System.out.println("Enter Source");
		String source=in.next();
		System.out.println("Enter Destination");
		String destination=in.next();
		System.out.println("Enter the required number of seats");
		int numberOfSeats=in.nextInt();
		try {
			if(user.checkAvailableSeats(fId,numberOfSeats,source,destination))
				System.out.println("The seats are available");
		} catch (FlightException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

	public static void flight() {
		// TODO Auto-generated method stub
		user.addDetails();
		System.out.println("Which flight do you want");
		String availableFlight=in.next()+in.nextLine();
		try {
			user.checkFlight(availableFlight);
		} catch (AvailabilityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void dt() {
		// TODO Auto-generated method stub
		user.addDetails();
		System.out.println("On which date  you want to plan the journey");
		System.out.println("Enter the date in dd-mm-yyyy format");
		in.nextLine();
		String arr[] = {"10abc","11def","12ght"};
		
		String dateTime=in.nextLine();
		try {
			if(user.checkDateTime(dateTime,arr)) {
				System.out.println("Flight Is Avaliable");
			}
		} catch (dateTimeException e) {
			System.out.println(e.getMessage());
			
		}
	}

}
