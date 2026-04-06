package study.LLD.udemy.designpatterns.problem.ridesharingappV2;

abstract class User {
	private String name;
	private String email;
	private Location location;

	public User(String name, String email, Location location) {
		this.name = name;
		this.location = location;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Location getLocation() {
		return location;
	}

//	public void setLocation(Location location) {
//		this.location = location;
//	}

	public abstract void notifyUser(String msg);
}