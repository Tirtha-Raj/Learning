package study.LLD.udemy.oops.behavioural.observer;

public class WeatherShowMain {
	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		
		ObserverIntf mobile = new MobileDisplay();
		ObserverIntf bigScreen  = new BigScreenDisplay();
		ObserverIntf ob = temp -> System.out.println("Current temparature in OBs Functional Intf is " + temp);
		
		weatherStation.attach(bigScreen);
		weatherStation.attach(mobile);
		weatherStation.attach(ob);
		
		weatherStation.setTemparature(10.88f);
	}
}
