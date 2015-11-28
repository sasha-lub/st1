package ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts;
/**
 * Class associated with passenger aircrafts which are carrying out flight for the shortest distances below 1000 km
 * @author Sasha
 *
 */
public class LocalAirlinesAircraft extends PassengerAircraft {

	public LocalAirlinesAircraft(String model, int carryingCapacity,
			int passengersCapacity, int distance, int fuelConsumption) {
		super(model, carryingCapacity, passengersCapacity, distance,
				fuelConsumption);
	}

	@Override
	public void setDistance(int distance) {
		if (distance < 1000) {
			super.setDistance(distance);
		} else {
			throw new IllegalArgumentException(
					"LocalAirlinesAircraft should have distance not exceeding 1000 km!");
		}
	}
	@Override
	public void setType() {
		setType("Passanger, local airlines only");
	}
}
