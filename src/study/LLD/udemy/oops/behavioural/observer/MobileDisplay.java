package study.LLD.udemy.oops.behavioural.observer;

public class MobileDisplay implements ObserverIntf {

	@Override
	public void display(float temparature) {
		System.out.println("Current temparature in MobileDisplay is " + temparature);
	}
}
