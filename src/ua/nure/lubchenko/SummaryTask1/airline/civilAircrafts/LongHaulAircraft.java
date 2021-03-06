package ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts;
/**
 * Class associated with passenger aircrafts which are carrying out flight for the long distances (above 6000 km) 
 * @author Sasha
 *
 */
public class LongHaulAircraft extends PassengerAircraft {

	public LongHaulAircraft(String model, int carryingCapacity,
			int passengersCapacity, int distance, int fuelConsumption) {
		super(model, carryingCapacity, passengersCapacity, distance,
				fuelConsumption);
	}

	@Override
	public void setDistance(int distance) {
		if (distance >= 6000) {
			super.setDistance(distance);
		} else {
			throw new IllegalArgumentException(
					"LongHaulAircraft should have distance equal or exceeding 6000 km!");
		}
	}

	@Override
	public void setType() {
		setType("Passanger, long-haul");
	}
}
