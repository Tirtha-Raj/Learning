package study.LLD.udemy.designpatterns.problem.ridesharingappV2;

public class Bike extends Vehicle {

	public Bike(String numberPlate) {
		super(numberPlate);
	}

	@Override
	public double calculateFare(double distance) {
		return 10 * distance;
	}

}