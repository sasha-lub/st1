package ua.nure.lubchenko.SummaryTask1.airline.civilAircrafts;
/**
 * Class associated with aircrafts which are used for freight transport
 * @author Sasha
 *
 */
public class Freighter extends Aircraft {

	public Freighter(String model, int carryingCapacity,
			int passengersCapacity, int distance, int fuelConsumption) {
		super(model, carryingCapacity, passengersCapacity, distance,
				fuelConsumption);
	}

	@Override
	public void setType() {
		setType("Freighter");
	}
}
