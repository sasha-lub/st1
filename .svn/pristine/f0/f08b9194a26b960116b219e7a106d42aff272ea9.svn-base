package ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;

import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.LongHaulAircraft;

public class LongHaulAircraftTest {
	static LongHaulAircraft plane = new LongHaulAircraft("testPlane", 300, 1,
			7010, 110);

	@Test(expected = IllegalArgumentException.class)
	public void setDistanceThrowsIllegalArgEx() throws FileNotFoundException {
		plane.setDistance(5999);
	}
	
	@Test
	public void setTypeTest(){
		String expected = "Passanger, long-haul";
		plane.setType();
		String actual = plane.getType();
		assertEquals(expected, actual);
	}
}
