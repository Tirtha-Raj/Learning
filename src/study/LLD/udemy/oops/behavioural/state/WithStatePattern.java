package study.LLD.udemy.oops.behavioural.state;

public class WithStatePattern {

	public static void main(String[] args) {
		State state = new CycleState();
		
		DirectionServiceV2 ds = new DirectionServiceV2(state);
		
		ds.getEta();
		ds.getDirection();
		
		ds.setState(new TrainState());
		ds.getEta();
		ds.getDirection();
	}
}

class DirectionServiceV2 {
	private State state;

	public DirectionServiceV2(State state) {
		this.state = state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void getEta() {
		state.getETA();
	}

	public void getDirection() {
		state.getDirection();
	}
}

interface State {
	public void getETA();

	public void getDirection();
}

class CycleState implements State {

	@Override
	public void getETA() {
		System.out.println("Cycling.......50mins");

	}

	@Override
	public void getDirection() {
		System.out.println("Cycling.......");

	}

}

class TrainState implements State {

	@Override
	public void getETA() {
		System.out.println("Train traveling 20mins");

	}

	@Override
	public void getDirection() {
		System.out.println("Train traveling");

	}

}