package ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.Aircraft;
import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.Freighter;

public class AircraftTest {
	Aircraft plane = new Freighter("test plane", 300, 1, 1234, 1234);

	@Test(expected = IllegalArgumentException.class)
	public void setModelWithNullArgs() {
		plane.setModel("");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setFuelWithZeroArgs() {
		plane.setFuelConsumption(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setPassCapacityWIthZeroArgs() {
		plane.setPassengersCapacity(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setDistanceWithZeroArgs() {
		plane.setDistance(0);
	}
	
	@Test
	public void setCarryingCapacityByDefIfTheArgIsWrong() {
		int expected = 200;
		plane.setCarryingCapacity(1);
		int actual = plane.getCarryingCapacity();
		assertEquals(expected, actual);
	}
}
