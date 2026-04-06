package study.LLD.udemy.designpatterns.problem.ridesharingappV2;

public class Driver extends User {

	private Vehicle vehicle;

	public Driver(String name, String email, Location location, Vehicle vehicle) {
		super(name, email, location);
		this.vehicle = vehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	@Override
	public void notifyUser(String msg) {
		System.out.println(msg);
	}

}
