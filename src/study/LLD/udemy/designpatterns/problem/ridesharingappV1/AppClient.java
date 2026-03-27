package study.LLD.udemy.designpatterns.problem.ridesharingappV1;

public class AppClient {
	public static void main(String[] args) {
		// Locations
		Location loc1 = new Location(22.5726, 88.3639); // Kolkata
		Location loc2 = new Location(22.8456, 88.3775); // Barrackpore
		Location loc3 = new Location(22.9700, 88.4300); // Kalyani
		Location loc4 = new Location(22.8963, 88.3922); // Naihati
		Location loc5 = new Location(22.7400, 88.3800); // Barasat

		// Vehicle
		Vehicle v1 = new Vehicle("WB01AB1234", "Car");
		Vehicle v2 = new Vehicle("WB02CD5678", "Bike");
		Vehicle v3 = new Vehicle("WB03EF9012", "Bus");

		//Drivers
		Driver d1 = new Driver("Rahul", v1, loc1);
		Driver d2 = new Driver("Amit", v2, loc3);
		Driver d3 = new Driver("Sourav", v3, loc5);
		
		//Passengers
		Passenger p1 = new Passenger("Anita", loc2);
		Passenger p2 = new Passenger("Rohit", loc4);
		
		RideSharingApp rsApp = new RideSharingApp();
		
		rsApp.addDrivers(d1);
		rsApp.addDrivers(d2);
		rsApp.addDrivers(d3);
		
		rsApp.addPassengers(p1);
		rsApp.addPassengers(p2);
		
		rsApp.bookRide(p1, 10);		
		rsApp.bookRide(p2, 40);
	}
}
