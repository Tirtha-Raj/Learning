package study.LLD.udemy.designpatterns.problem.ridesharingappV2;

public interface FareStrategy {

	double fareCaculation(Vehicle vehicle, double distance);
}

class StandardFare implements FareStrategy {

	@Override
	public double fareCaculation(Vehicle vehicle, double distance) {
		return vehicle.calculateFare(distance);
	}

}

class SharedFare implements FareStrategy {

	@Override
	public double fareCaculation(Vehicle vehicle, double distance) {
		return vehicle.calculateFare(distance) * 0.5;
	}

}

class LuxuryFare implements FareStrategy {

	@Override
	public double fareCaculation(Vehicle vehicle, double distance) {
		return vehicle.calculateFare(distance) * 1.5;
	}

}