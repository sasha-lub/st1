package ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts;
/**
 * Class associated with passenger aircrafts which are carrying out flight for distances in the range from 2500 to 6000 km
 * @author Sasha
 *
 */
public class MidRangeAircraft extends PassengerAircraft {

	public MidRangeAircraft(String model, int carryingCapacity,
			int passengersCapacity, int distance, int fuelConsumption) {
		super(model, carryingCapacity, passengersCapacity, distance,
				fuelConsumption);
	}

	@Override
	public void setDistance(int distance) {
		if (distance >= 2500 && distance < 6000) {
			super.setDistance(distance);
		} else {
			throw new IllegalArgumentException(
					"MidRangeAircraft should have distance in the range from 2500 to 6000 km!");
		}
	}
	
	@Override
	public void setType() {
		setType("Passanger, mid-range");
	}
}
