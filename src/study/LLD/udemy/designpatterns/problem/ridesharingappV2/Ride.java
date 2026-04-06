package study.LLD.udemy.designpatterns.problem.ridesharingappV2;

public class Ride {

	private Driver driver;
	private Passenger passenger;
	private FareStrategy fareStrategy;
	private double fare;
	private RideStatusEnum rideStatusEnum;
	private double distance;

	public Ride(Driver driver, Passenger passenger, FareStrategy fareStrategy, double distance) {
		this.driver = driver;
		this.passenger = passenger;
		this.fareStrategy = fareStrategy;
		this.distance = distance;
		this.rideStatusEnum = RideStatusEnum.SCHEDULED;
		rideFare();
		notifyUsersRideBooked();
	}

	private void notifyUsersRideBooked() {
		driver.notifyUser("Ride booked for " + passenger.getName() + " , reach the location " + passenger.getLocation()
				+ " , fare : " + fare);
		passenger.notifyUser("Ride booked, Driver is on the way to pick up, Name " + driver.getName()
				+ " , NumberPlate {} " + driver.getVehicle().getNumberPlate() + " , fare : " + fare);

	}

	private void rideFare() {
		System.out.println("Calculating fare with distance "+distance);
		fare = fareStrategy.fareCaculation(driver.getVehicle(), distance);
	}

	public RideStatusEnum getRideStatusEnum() {
		return rideStatusEnum;
	}

	public void updateRideStatus(RideStatusEnum rideStatusEnum) {
		this.rideStatusEnum = rideStatusEnum;
		driver.notifyUser("Passenger ride Status : " + rideStatusEnum.toString());
		passenger.notifyUser("Driver ride Status : " + rideStatusEnum.toString());
	}

}
