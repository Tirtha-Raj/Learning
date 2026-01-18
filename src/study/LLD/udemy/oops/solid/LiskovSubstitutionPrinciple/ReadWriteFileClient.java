package study.LLD.udemy.oops.solid.LiskovSubstitutionPrinciple;

public class ReadWriteFileClient {
	public static void main(String[] args) {
		readOrWrite(new Writable());
		readOrWrite(new ReadAble());
	}

	public static void readOrWrite(ReadAble r) {
		r.read();
	}
}
