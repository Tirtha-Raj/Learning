package study.LLD.udemy.oops.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class WithCompositePattern {
	public static void main(String[] args) {

		FileComponent file1 = new FileV2("File1");
		FileComponent file2 = new FileV2("File2");
		FolderV2 folder1 = new FolderV2("Folder1");
		folder1.addComponent(file1);
		folder1.addComponent(file2);

		FileComponent file3 = new FileV2("File3");
		FileComponent file4 = new FileV2("File4");
		FolderV2 folder2 = new FolderV2("Folder2");
		folder2.addComponent(file3);
		folder2.addComponent(file4);

		folder1.addComponent(folder2);
		folder1.showDetails();

	}
}

interface FileComponent {
	void showDetails();
}

class FolderV2 implements FileComponent {

	private String folderName;
	private List<FileComponent> components = new ArrayList<>();

	public FolderV2(String name) {
		folderName = name;
	}

	public void addComponent(FileComponent component) {
		components.add(component);
	}

	public void showDetails() {
		System.out.println("Showing folder : " + folderName);
		for (FileComponent component : components) {
			component.showDetails();
		}
	}
}

class FileV2 implements FileComponent {
	private String fileName;

	public FileV2(String name) {
		fileName = name;
	}

	public void showDetails() {
		System.out.println("Showing file : " + fileName);
	}
}