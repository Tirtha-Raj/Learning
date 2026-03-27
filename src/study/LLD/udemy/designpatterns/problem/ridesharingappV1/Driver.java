package study.LLD.udemy.designpatterns.problem.ridesharingappV1;

public class Driver {

	private String driverName;
	private Vehicle vehicle;
	private Location driverLocation;

	public Driver(String driverName, Vehicle vehicle, Location driverLocation) {
		this.driverLocation = driverLocation;
		this.driverName = driverName;
		this.vehicle = vehicle;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Location getDriverLocation() {
		return driverLocation;
	}

	public void setDriverLocation(Location driverLocation) {
		this.driverLocation = driverLocation;
	}

}