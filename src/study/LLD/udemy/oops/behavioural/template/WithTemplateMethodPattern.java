package study.LLD.udemy.oops.behavioural.template;

public class WithTemplateMethodPattern {

	public static void main(String[] args) {
		TemplateMethod templateMethod = new JsonParserII();
		templateMethod.fileTemplateMethod();
		
		templateMethod = new CSVParserII();
		templateMethod.fileTemplateMethod();
		
	}
	
}

//Template method pattern
abstract class TemplateMethod{
	
	void fileTemplateMethod() {
		openFile();
		parseFile();
		closeFile();
	}

	protected void openFile() {
		System.out.println("Opening the file");
	}
	
	protected abstract void parseFile();
	
	protected void closeFile() {
		System.out.println("Closing the file");
	}
}

class JsonParserII extends TemplateMethod{

	@Override
	protected void parseFile() {
		System.out.println("Parse to Json File");
	}
	
	@Override
	protected void openFile() {
		System.out.println("Opening the file from JsonParserII");
	}
	
}

class CSVParserII extends TemplateMethod{

	@Override
	protected void parseFile() {
		System.out.println("Parse to CSV File");
	}
	
}
