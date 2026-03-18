package study.LLD.udemy.designpatterns.problem.ridesharingapp;

import java.util.ArrayList;
import java.util.List;

public class Drivers {
	private List<Driver> drivers;

	public Drivers() {
		drivers = new ArrayList<Driver>();
	}

	public void addDrivers(Driver driver) {
		drivers.add(driver);
	}

	public List<Driver> getDrivers() {
		return this.drivers;
	}
}

class Driver {

	private String driverName;
	private VehicleType vehicleType;
	private int driverLocation;

	public Driver(String driverName, VehicleType vehicleType, int driverLocation) {
		this.driverLocation = driverLocation;
		this.driverName = driverName;
		this.vehicleType = vehicleType;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getDriverLocation() {
		return driverLocation;
	}

	public void setDriverLocation(int driverLocation) {
		this.driverLocation = driverLocation;
	}

}