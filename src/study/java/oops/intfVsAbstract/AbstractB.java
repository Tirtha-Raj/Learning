package study.java.oops.intfVsAbstract;

public class AbstractB extends AbstractA {

	public AbstractB(int age) {
		super(age);
	}

//	@Override
	void walk() {
		System.out.println("AbstractB is walking");
	}
}
