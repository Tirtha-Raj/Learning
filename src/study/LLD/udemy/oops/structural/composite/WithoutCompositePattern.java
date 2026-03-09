package study.LLD.udemy.oops.structural.composite;

import java.util.ArrayList;
import java.util.List;

//Problem: We need to create a File system where we can store folders and files and use or show them
public class WithoutCompositePattern {
	public static void main(String[] args) {
		File file1 = new File("File1");
		File file2 = new File("File2");

		Folder folder1 = new Folder("Folder1");
		folder1.addFile(file1);
		folder1.addFile(file2);

		folder1.showDetails();
		// Now problem is folder can also be inside folder but here we can not do it
	}

}

class Folder {

	private String folderName;
	private List<File> files = new ArrayList<>();

	public Folder(String name) {
		folderName = name;
	}

	public void addFile(File file) {
		files.add(file);
	}

	public void showDetails() {
		System.out.println("Showing folder : " + folderName);
		for (File file : files) {
			file.showDetails();
		}
	}
}

class File {
	private String fileName;

	public File(String name) {
		fileName = name;
	}

	public void showDetails() {
		System.out.println("Showing file : " + fileName);
	}
}