package ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;

import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.LocalAirlinesAircraft;

public class LocalAirlinesAircraftTest {

	static LocalAirlinesAircraft plane = new LocalAirlinesAircraft ("testPlane", 300, 1,
			900, 110);

	@Test(expected = IllegalArgumentException.class)
	public void setDistanceThrowsIllegalArgEx() throws FileNotFoundException {
		plane.setDistance(1200);
	}
	
	@Test
	public void setTypeTest(){
		String expected = "Passanger, local airlines only";
		plane.setType();
		String actual = plane.getType();
		assertEquals(expected, actual);
	}
}