package study.LLD.udemy.designpatterns.problem.ridesharingappV2;

import java.util.ArrayList;
import java.util.List;

public class RideMatchingSystem {

	private List<Driver> drivers = new ArrayList<Driver>();

//	public RideSharingApp() {}
	public void addDrivers(Driver driver) {
		drivers.add(driver);
	}

	public List<Driver> getDrivers() {
		return this.drivers;
	}

	public void bookRide(Passenger passenger, int distanceToTravel, FareStrategy fareStrategy) {

		if (drivers.isEmpty()) {
			passenger.notifyUser("Drivers are busy");
			return;
		}
		Driver nearestDriver = findNearestDriver(passenger);
		Ride ride = new Ride(nearestDriver, passenger, fareStrategy, distanceToTravel);
		drivers.remove(nearestDriver);

		ride.updateRideStatus(RideStatusEnum.ONGOING);

		ride.updateRideStatus(RideStatusEnum.COMPLETED);
		drivers.add(nearestDriver);
	}

	private Driver findNearestDriver(Passenger passenger) {
		Driver assignedDriver = null;
		double minLength = Double.MAX_VALUE;
		for (Driver driver : drivers) {
			double calculatedDistance = driver.getLocation().calculateDistance(passenger.getLocation());
			if (minLength > calculatedDistance) {
				minLength = calculatedDistance;
				assignedDriver = driver;
			}
		}
		return assignedDriver;
	}
}
