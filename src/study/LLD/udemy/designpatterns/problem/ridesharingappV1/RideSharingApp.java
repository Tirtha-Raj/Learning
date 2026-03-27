package study.LLD.udemy.designpatterns.problem.ridesharingappV1;

import java.util.ArrayList;
import java.util.List;

public class RideSharingApp {
	private static final int EARTH_RADIUS_KM = 6371; // Earth's radius in km

	private List<Driver> drivers;
	private List<Passenger> passengers;

	public RideSharingApp() {
		drivers = new ArrayList<Driver>();
		passengers = new ArrayList<Passenger>();
	}

	public void addDrivers(Driver driver) {
		drivers.add(driver);
	}

	public List<Driver> getDrivers() {
		return this.drivers;
	}

	public void addPassengers(Passenger passenger) {
		passengers.add(passenger);
	}

	public List<Passenger> getPassengers() {
		return this.passengers;
	}

	public void bookRide(Passenger passenger, int distanceToTravel) {

		if (drivers.isEmpty()) {
			System.out.println("Drivers are busy");
			return;
		}

		Driver assignedDriver = null;
		double minLength = Double.MAX_VALUE;
		for (Driver driver : drivers) {
			double calculatedDistance = calculateDistance(driver.getDriverLocation(), passenger.getPassengerLocation());
			if (minLength > calculatedDistance) {
				minLength = calculatedDistance;
				assignedDriver = driver;
			}
		}
		double fare = calculateFare(assignedDriver.getVehicle(), distanceToTravel);
		System.out.printf("Driver : " + assignedDriver.getDriverName() + ", Number plate : "
				+ assignedDriver.getVehicle().getNumberPlate() + ", is on the way for " + passenger.getPassengerName()
				+ ", fare :  %.3f ", fare);
		System.out.println();
	}

	private double calculateFare(Vehicle vehicle, int distanceToTravel) {
		if (vehicle.getType().equalsIgnoreCase("Car"))
			return distanceToTravel * 20;
		else if (vehicle.getType().equalsIgnoreCase("Bike"))
			return distanceToTravel * 10;
		else
			return distanceToTravel * 5;
	}

	private double calculateDistance(Location driverLocation, Location passengerLocation) {
		double latDistance = Math.toRadians(driverLocation.getLatitude() - passengerLocation.getLatitude());
		double lonDistance = Math.toRadians(driverLocation.getLongitude() - passengerLocation.getLongitude());

		double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
				+ Math.cos(Math.toRadians(driverLocation.getLatitude()))
						* Math.cos(Math.toRadians(passengerLocation.getLatitude())) * Math.sin(lonDistance / 2)
						* Math.sin(lonDistance / 2);

		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

		double distance = EARTH_RADIUS_KM * c;

		return (int) Math.round(distance); // rounded km
	}
}
