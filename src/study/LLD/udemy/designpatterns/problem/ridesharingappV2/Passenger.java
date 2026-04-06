package study.LLD.udemy.designpatterns.problem.ridesharingappV2;

public class Passenger extends User {

	public Passenger(String name, String email, Location location) {
		super(name, email, location);
	}

	@Override
	public void notifyUser(String msg) {
		System.out.println(msg);
	}


}
