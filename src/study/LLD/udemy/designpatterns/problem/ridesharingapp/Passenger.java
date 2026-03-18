package study.LLD.udemy.designpatterns.problem.ridesharingapp;

public class Passenger {

	private String passengerName;
	private int passengerLocation;

	public Passenger(String name, int location) {
		this.passengerName = name;
		this.passengerLocation = location;
	}

	public String getPassengerName() {
		return this.passengerName;
	}

	public int getPassengerLocation() {
		return this.passengerLocation;
	}
}

