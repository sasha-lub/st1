package ua.nure.lubchenko.SummaryTask1.airline;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import ua.nure.lubchenko.SummaryTask1.airline.Airline;
import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.Aircraft;
import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.LocalAirlinesAircraft;
import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.LongHaulAircraft;
import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.ShortHaulAircraft;

public class AirlineTest {

	static Airline airline = new Airline();

	@BeforeClass
	public static void setUpGlobal() {
		airline.add(new LongHaulAircraft("plane1", 100, 1, 9000, 900));
		airline.add(new ShortHaulAircraft("plane2", 100, 1, 1500, 150));
		airline.add(new LocalAirlinesAircraft("plane3", 100, 1, 500, 50));
	}

	@Test
	public void addAndCountTest() {
		int expected = 3;
		int actual = airline.getCountOfAircrafts();
		
		assertEquals(expected, actual);
	}

	@Test
	public void summaryPassengerCapacityTest() {
		int expected = 3;
		int actual = airline.getSummaryPassengersCapacity(airline);
		
		assertEquals(expected, actual);
	}

	@Test
	public void summaryCaryingCapacityTest() {
		int expected = 300;
		int actual = airline.getSummaryCarryingCapacity(airline);
		
		assertEquals(expected, actual);
	}

	@Test
	public void findByFuelConsumptionTest() {
		String expected = "plane2";

		Airline selection = airline.findByFuelConsumption(75, 175);
		Aircraft plane = selection.get(0);
		String actual = plane.getModel();

		assertEquals(expected, actual);
	}
	
	@Test
	public void airlineToStringTest() {
		String expected = "--- Airline ---";
		
		int subStrLen = expected.length();
		String actual = airline.toString().substring(0, subStrLen);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void sortByDistanceTest() {
		String expected = "plane3";

		airline.sortByDistanse();
		Aircraft plane = airline.get(0);
		String actual = plane.getModel();

		assertEquals(expected, actual);
	}

}
