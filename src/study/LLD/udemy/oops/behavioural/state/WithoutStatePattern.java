package study.LLD.udemy.oops.behavioural.state;

//You are tasked with building a DirectionService class for a navigation app. This class calculates the
//estimated time of arrival (ETA) and provides directions between two points. The ETA and direction differ
//based on the mode of transportation, which can be one of the following:
//● Walking
//● Cycling
//● Car
//● Train

public class WithoutStatePattern {
	public static void main(String[] args) {
		DirectionService ls = new DirectionService(StateEnum.CYCLE);
		ls.getETA();
		ls.getDirection();
		
		ls.setMode(StateEnum.TRAIN);
		ls.getETA();
		ls.getDirection();
	}
}

enum StateEnum {
	CYCLE, WALK, RUN, TRAIN
}

class DirectionService {

	private StateEnum state;

	public DirectionService(StateEnum state) {
		this.state = state;
	}

	public void setMode(StateEnum state) {
		this.state = state;
	}

	public void getDirection() {
		switch (this.state) {
		case CYCLE:
			System.out.println("Cycling.......");
			break;
		case WALK:
			System.out.println("Walking.......");
			break;
		case RUN:
			System.out.println("Running....... ");
			break;
		case TRAIN:
			System.out.println("Train traveling");
			break;
		default:
			break;
		}

	}
	
	public void getETA() {
		switch (this.state) {
		case CYCLE:
			System.out.println("Cycling.......50mins");
			break;
		case WALK:
			System.out.println("Walking.......120mins");
			break;
		case RUN:
			System.out.println("Running....... 80mins");
			break;
		case TRAIN:
			System.out.println("Train traveling 20mins");
			break;
		default:
			break;
		}

	}

}