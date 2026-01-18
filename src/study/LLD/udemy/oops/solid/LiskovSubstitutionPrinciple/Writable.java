package study.LLD.udemy.oops.solid.LiskovSubstitutionPrinciple;

public class Writable extends ReadAble implements IWritable {

	@Override
	public void write() {
		System.out.println("Writing in file");		
	}


}
