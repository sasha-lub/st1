package ua.nure.lubchenko.SummaryTask1.airline;

/**
 * Class associated with real airline. Represented as a parameterized collection. Can contain subtypes of Aircraft.
 * @author Sasha
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.Aircraft;

public class Airline implements Iterable<Aircraft> {
	private List<Aircraft> airline = new ArrayList<Aircraft>();

	public void add(Aircraft aircraft) {
		airline.add(aircraft);
	}

	/**
	 * Method sorts aircrafts of the current airline by distance of their
	 * flights in natural order
	 */
	public void sortByDistanse() {
		Collections.sort(airline, new Comparator<Aircraft>() {
			@Override
			public int compare(Aircraft o1, Aircraft o2) {
				return o1.getDistance() - o2.getDistance();
			}
		});
	}

	/**
	 * Returns readable information about an airline's content
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("--- Airline ---").append(System.lineSeparator());
		for (Aircraft aircraft : airline) {
			result.append(System.lineSeparator()).append(aircraft.toString())
					.append(System.lineSeparator()).append("---------");
		}
		return result.toString();
	}

	/**
	 * @param min
	 * @param max
	 *            Returns new airline collection which contents only aircrafts
	 *            with value of fuelConsumption matching to specified range
	 */
	public Airline findByFuelConsumption(int min, int max) {
		Airline planes = new Airline();
		for (Aircraft plane : airline) {
			if (plane.getFuelConsumption() >= min
					&& plane.getFuelConsumption() <= max) {
				planes.add(plane);
			}
		}
		return planes;
	}

	/**
	 * @param airline
	 *            Returns summary carrying capacity of the all aircrafts of the
	 *            current airline
	 */
	public int getSummaryCarryingCapacity(Airline airline) {
		int summaryCapacity = 0;
		for (Aircraft aircraft : airline) {
			summaryCapacity += aircraft.getCarryingCapacity();
		}
		return summaryCapacity;
	}

	/**
	 * @param Airline
	 *            Returns summary passengers capacity of the all aircrafts of
	 *            the current airline
	 */
	public int getSummaryPassengersCapacity(Airline airline) {
		int summaryCapacity = 0;
		for (Aircraft aircraft : airline) {
			summaryCapacity += aircraft.getPassengersCapacity();
		}
		return summaryCapacity;
	}
	
	public int getCountOfAircrafts(){
		return airline.size();
	}
	
	public Aircraft get(int index){
		return airline.get(index);
	}

	@Override
	public Iterator<Aircraft> iterator() {
		return airline.iterator();
	}
}
