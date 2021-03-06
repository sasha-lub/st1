//JTJ-392
package ua.nure.lubchenko.SummaryTask1;

import ua.nure.lubchenko.SummaryTask1.airline.Airline;
import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.Freighter;
import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.LocalAirlinesAircraft;
import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.LongHaulAircraft;
import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.MidRangeAircraft;
import ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts.ShortHaulAircraft;

/**
 * Demonstration class
 * 
 * @author Sasha
 *
 */
public class Demo {
	static final int MIN_FUEL_CONSUMTION = 300;
	static final int MAX_FUEL_CONSUMTION = 1200;

	public static void main(String[] args) {

		Airline airline = new Airline();
		airline.add(new Freighter("AN-225", 253_800, 94, 4000, 12600));
		airline.add(new LongHaulAircraft("Airbus A310-300", 32_100, 280, 9540, 4772));
		airline.add(new ShortHaulAircraft("Embraer EMB 120", 11_500, 32, 1750, 390));
		airline.add(new Freighter("Aero Spacelines B-377 Guppy", 24_700, 4, 3219, 1100));
		airline.add(new MidRangeAircraft("Bombardier CRJ900", 35_000, 88, 2700, 970));
		airline.add(new LocalAirlinesAircraft("Ecranolet S-90", 9500, 27, 760, 131));

		airline.sortByDistanse();

		System.out.println(airline);
		System.out.println();
		System.out
				.printf("Aircrafts with fuel consumption in the range from %d to %d kg per hour",
						MIN_FUEL_CONSUMTION, MAX_FUEL_CONSUMTION);
		System.out.println();
		Airline aircraftsBySelection = airline.findByFuelConsumption(123, 777);
		System.out.println(aircraftsBySelection);
		System.out.println();
		System.out.printf("Summary passenger capacity : %d people abroad",
				airline.getSummaryPassengersCapacity(airline));
		System.out.println();
		System.out.printf("Summary carrying capacity : %d kg",
				airline.getSummaryCarryingCapacity(airline));

	}
}
