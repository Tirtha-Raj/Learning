package study.LLD.udemy.designpatterns.problem.ridesharingappV1;

public class Passenger {

	private String passengerName;
	private Location passengerLocation;

	public Passenger(String name, Location location) {
		this.passengerName = name;
		this.passengerLocation = location;
	}

	public String getPassengerName() {
		return this.passengerName;
	}

	public Location getPassengerLocation() {
		return this.passengerLocation;
	}
}
