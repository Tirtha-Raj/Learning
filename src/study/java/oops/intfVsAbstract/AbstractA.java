package study.java.oops.intfVsAbstract;

abstract class AbstractA {
	private int age;

	public AbstractA(int age) {
		this.age = age;
	}

	abstract void walk();

	void age() {
		System.out.println("Age is " + this.age);
	}
}
