package ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts;
/**
 * Class associated with passenger aircrafts which are carrying out flight for the short distances in the range from 1000 to 2500 km
 * @author Sasha
 *
 */
public class ShortHaulAircraft extends PassengerAircraft {

	public ShortHaulAircraft(String model, int carryingCapacity,
			int passengersCapacity, int distance, int fuelConsumption) {
		super(model, carryingCapacity, passengersCapacity, distance,
				fuelConsumption);
	}

	@Override
	public void setDistance(int distance) {
		if (distance >= 1000 && distance < 2500) {
			super.setDistance(distance);
		} else {
			throw new IllegalArgumentException(
					"ShortHaulAircraft should have distance in the range from 1000 to 2500 km!");
		}
	}
	@Override
	public void setType() {
		setType("Passanger, short-haul");
	}

}
