package study.LLD.udemy.oops.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

	private float temparature;
	private List<ObserverIntf> observers;

	public WeatherStation() {
		observers = new ArrayList<>();
	}

	public float getTemparature() {
		return temparature;
	}

	public void setTemparature(float temparature) {
		this.temparature = temparature;
		notifyAllObserver();
	}

	@Override
	public void attach(ObserverIntf observer) {
		observers.add(observer);

	}

	@Override
	public void detach(ObserverIntf observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAllObserver() {
		for(ObserverIntf ob : observers) {
			ob.display(this.temparature);
		}

	}

}
