package study.LLD.udemy.oops.behavioural.template;

//Problem : you want to parse a file to json or csv or any file having some common method as openfile() & closeFile()
//				but in between you have to write the logic of that particular file parser
public class WithoutTemplateMethodPattern {
	 public static void main(String[] args) {
		 JsonParser jsonParser = new JsonParser();
		 jsonParser.openFile();
		 jsonParser.parseFile();
		 jsonParser.closeFile();
		 
		 CSVParser csvParser = new CSVParser();
		 csvParser.openFile();
		 csvParser.parseFile();
		 csvParser.closeFile();
	}

}

class JsonParser{
	
	void openFile() {
		System.out.println("Opening the file");
	}
	
	void parseFile() {
		System.out.println("Parsing to JSON File");
	}
	
	void closeFile() {
		System.out.println("Closing the file");
	}
}


class CSVParser{
	
	void openFile() {
		System.out.println("Opening the file");
	}
	
	void parseFile() {
		System.out.println("Parsing to CSV File");
	}
	
	void closeFile() {
		System.out.println("Closing the file");
	}
}