package study.LLD.udemy.oops.creational.factory;

//We have to create a service having multiple transport layer 
//	and can be change in runtime in without changing the client code
public class WithoutFactoryPattern {
	public static void main(String[] args) {
		Transport bus = new Bus();
		Transport car = new Car();
		
		bus.delivery();
		car.delivery();
		
//		here problem is it can not be changed at run time 
//			here the client code needs to update to call another transport layer
	}
}

interface Transport {
	public void delivery();
}

class Bus implements Transport {

	@Override
	public void delivery() {
		System.out.println("Delivering by Bus");
	}

}

class Car implements Transport {
	@Override
	public void delivery() {
		System.out.println("Delivering by Car");
	}
}