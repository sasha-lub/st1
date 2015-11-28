package ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.Freighter;

public class FreighterTest {

	static Freighter plane = new Freighter("testPlane", 300, 1,
			1000, 110);

	@Test
	public void setTypeTest(){
		String expected = "Freighter";
		plane.setType();
		String actual = plane.getType();
		assertEquals(expected, actual);
	}
}
