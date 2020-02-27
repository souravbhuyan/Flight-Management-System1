package com.cg.dao;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DaoTest {
	private static ScheduledFlightDaoImpl test;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		test=new ScheduledFlightDaoImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void checkAvailableSeatstest() {
		boolean val=test.checkAvailableSeats(5,"10abc","31-01-2020","MUM","BAN");
		assertNotNull(val);
		
	}
	

}
