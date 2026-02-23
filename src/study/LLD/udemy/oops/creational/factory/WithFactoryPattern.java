package study.LLD.udemy.oops.creational.factory;

public class WithFactoryPattern {
	public static void main(String[] args) {
		Transport vehicle = TransportFactory.getTransportFactory("Bus");
		vehicle.delivery();
		
		vehicle = TransportFactory.getTransportFactory("Car"); //" " values we can change runtime 
		vehicle.delivery();
	}

}

//for changing something no need to touch client code, changes required only in factory method
class TransportFactory {

	public static Transport getTransportFactory(String transportType) {
		switch (transportType) {
		case "Bus":
			return new Bus();
		case "Car":
			return new Car();
		default:
			throw new IllegalArgumentException("Unexpected transport type : " + transportType);
		}
	}
}
