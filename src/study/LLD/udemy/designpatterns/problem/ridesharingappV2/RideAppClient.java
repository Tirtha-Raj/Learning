package study.LLD.udemy.designpatterns.problem.ridesharingappV2;

public class RideAppClient {
	public static void main(String[] args) {

		// Locations
		Location loc1 = new Location(22.5726, 88.3639); // Kolkata
		Location loc2 = new Location(22.8456, 88.3775); // Barrackpore
		Location loc3 = new Location(22.9700, 88.4300); // Kalyani
		Location loc4 = new Location(22.8963, 88.3922); // Naihati
		Location loc5 = new Location(22.7400, 88.3800); // Barasat

		// Vehicle
		Car c1 = new Car("WB01AB1234");
		Car c2 = new Car("WB02CD5678");
		Bike b1 = new Bike("WB03EF9012");

		// Drivers
		Driver d1 = new Driver("Rahul", "rahul@gmial.com", loc1, c1);
		Driver d2 = new Driver("Amit", "amit@gmial.com", loc3, b1);
		Driver d3 = new Driver("Sourav", "sourav@gmial.com", loc5, c2);

		// Passengers
		Passenger p1 = new Passenger("Anita", "anita@gmial.com", loc1);
		Passenger p2 = new Passenger("Rohit", "rohit@gmial.com", loc4);

		RideMatchingSystem rsApp = new RideMatchingSystem();
		rsApp.addDrivers(d1);
		rsApp.addDrivers(d2);
		rsApp.addDrivers(d3);

		rsApp.bookRide(p1, 40, new LuxuryFare());
		rsApp.bookRide(p2, 10, new StandardFare());

	}
}
