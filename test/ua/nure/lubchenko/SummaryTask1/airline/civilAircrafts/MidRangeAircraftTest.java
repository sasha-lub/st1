package ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;

import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.MidRangeAircraft;

public class MidRangeAircraftTest {
	static MidRangeAircraft plane = new MidRangeAircraft("testPlane", 300, 1,
			4000, 110);

	@Test(expected = IllegalArgumentException.class)
	public void setDistanceThrowsIllegalArgEx() throws FileNotFoundException {
		plane.setDistance(2499);
	}
	
	@Test
	public void setTypeTest(){
		String expected = "Passanger, mid-range";
		plane.setType();
		String actual = plane.getType();
		assertEquals(expected, actual);
	}
}