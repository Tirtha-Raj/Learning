package study.LLD.udemy.oops.solid.LiskovSubstitutionPrinciple;

public class ReadAble implements IReadable {

	@Override
	public void read() {
		System.out.println("Reading file");

	}

}
