package study.LLD.udemy.oops.behavioural.observer;

public class BigScreenDisplay implements ObserverIntf{

	@Override
	public void display(float temparature) {
		System.out.println("Current temparature in BigScreenDisplay is "+temparature);	
	}

}
