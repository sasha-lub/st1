package ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;

import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.ShortHaulAircraft;

public class ShortHaulAircraftTest {
	static ShortHaulAircraft plane = new ShortHaulAircraft("testPlane", 300, 1,
			1010, 110);

	@Test(expected = IllegalArgumentException.class)
	public void setDistanceThrowsIllegalArgEx() throws FileNotFoundException {
		plane.setDistance(900);
	}
	
	@Test
	public void setTypeTest(){
		String expected = "Passanger, short-haul";
		plane.setType();
		String actual = plane.getType();
		assertEquals(expected, actual);
	}
}
