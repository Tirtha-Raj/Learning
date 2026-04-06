package study.LLD.udemy.designpatterns.problem.ridesharingappV2;

abstract class Vehicle {

	private String numberPlate;

	public Vehicle(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	abstract double calculateFare(double distance);
}