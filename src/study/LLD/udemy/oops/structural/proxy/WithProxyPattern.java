package study.LLD.udemy.oops.structural.proxy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WithProxyPattern {
	public static void main(String[] args) {
		Image img1 = new ProxyImage("dog.jpg");
		Image img2 = new ProxyImage("dog.jpg");
		Image img3 = new ProxyImage("cat.jpg");
		Image img4 = new ProxyImage("cat.jpg");

		img1.display();
		img2.display();
		img3.display();
		img4.display();
	}
}

class ProxyImage implements Image {

	private String fileName;
	private static Map<String, RealImage> image = new ConcurrentHashMap<>(); // concurrent hash map due to thread safe not needed here

	public ProxyImage(String filename) {
		this.fileName = filename;
	}

	@Override
	public void display() {
		RealImage realImage = image.get(fileName);
		if (realImage == null) {
			realImage = new RealImage(this.fileName);
			image.put(fileName, realImage);
		}
		realImage.display();

	}

}