package study.LLD.udemy.designpatterns.problem.ridesharingappV1;

public class Vehicle {

	private String numberPlate;
	private String type;

	public Vehicle(String numberPlate, String type) {
		this.numberPlate = numberPlate;
		this.type = type;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public String getType() {
		return type;
	}

//	int calculateFare(int distance);
//}
//
//class Car implements VehicleType {
//
//	@Override
//	public int calculateFare(int distance) {
//		return distance * 25;
//	}
//
//}
//
//class LuxuryCar implements VehicleType {
//
//	@Override
//	public int calculateFare(int distance) {
//		return distance * 50;
//	}
//
//}
//
//class Bike implements VehicleType {
//
//	@Override
//	public int calculateFare(int distance) {
//		return distance * 10;
//	}

}