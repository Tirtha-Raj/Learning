package study.LLD.udemy.designpatterns.problem.ridesharingappV2;

public class Car extends Vehicle {

	public Car(String numberPlate) {
		super(numberPlate);
	}

	@Override
	public double calculateFare(double distance) {
		return 20 * distance;
	}

}
