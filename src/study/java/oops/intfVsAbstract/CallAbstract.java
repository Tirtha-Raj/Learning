package study.java.oops.intfVsAbstract;

public class CallAbstract {

	public static void main(String[] args) {
		AbstractA a = new AbstractB(10);
		a.age();
	}
}
