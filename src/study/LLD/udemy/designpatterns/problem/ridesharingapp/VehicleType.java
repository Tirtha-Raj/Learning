package study.LLD.udemy.designpatterns.problem.ridesharingapp;

public interface VehicleType {

	int calculateFare(int distance);
}

class Car implements VehicleType {

	@Override
	public int calculateFare(int distance) {
		return distance * 25;
	}

}

class LuxuryCar implements VehicleType {

	@Override
	public int calculateFare(int distance) {
		return distance * 50;
	}

}

class Bike implements VehicleType {

	@Override
	public int calculateFare(int distance) {
		return distance * 10;
	}

}