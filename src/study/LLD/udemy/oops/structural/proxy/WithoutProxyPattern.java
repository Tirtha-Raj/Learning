package study.LLD.udemy.oops.structural.proxy;

//Problem : You need to show the image when required not every time, and once a image has render no need to render
//	we can take the cache of that image.
public class WithoutProxyPattern {
	public static void main(String[] args) {
		Image img1 = new RealImage("dog.jpg");
		Image img2 = new RealImage("dog.jpg"); // same thing loading twice
		
		
		img1.display();
		img2.display();
	}
}

interface Image {
	void display();
}

class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;

		loadImageFromDisk(); // expensive operation
	}

	private void loadImageFromDisk() {
		System.out.println("Loading image : " + fileName);

	}

	@Override
	public void display() {
		System.out.println("Displaying image : " + fileName);
	}

}