package study.LLD.udemy.designpatterns.problem.ridesharingappV2;

public class Location {

	private static final int EARTH_RADIUS_KM = 6371; // Earth's radius in km

	private double latitude;
	private double longitude;

	public Location(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double calculateDistance(Location two) {
		double latDistance = Math.toRadians(latitude - two.getLatitude());
		double lonDistance = Math.toRadians(longitude - two.getLongitude());

		double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + Math.cos(Math.toRadians(latitude))
				* Math.cos(Math.toRadians(two.getLatitude())) * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);

		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

		double distance = EARTH_RADIUS_KM * c;

		return (int) Math.round(distance); // rounded km
	}

	@Override
	public String toString() {
		return "Location [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
}
