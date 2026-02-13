package study.LLD.udemy.oops.behavioural.observer;

public interface Subject {

	void attach(ObserverIntf observer);
	void detach(ObserverIntf observer);
	void notifyAllObserver();
}
