package study.LLD.udemy.oops.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WithFlyweightPattern {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			BulletV2 bullet = new BulletV2("Blue", 2 * i, 3 * i);
			bullet.display();
		}

		for (int i = 1; i <= 5; i++) {
			BulletV2 bullet = new BulletV2("Green", 10 * i, 20 * i);
			bullet.display();
		}
	}
}

class BulletType {
	private String color;

	public BulletType(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "BulletType [color=" + color + "]";
	}

}

class BulletTypeFactory {

	private static final Map<String, BulletType> bullet = new HashMap<>();

	public static BulletType getBulletType(String color) {
		if (!bullet.containsKey(color)) {
			bullet.put(color, new BulletType(color));
		}
		return bullet.get(color);
	}
}

class BulletV2 {

	private BulletType bulletType; // Intrinsic property : Same across all object //Bullet Images
	private int x; // Extrinsic property : unique for each object
	private int y;

	public BulletV2(String color, int x, int y) {
		this.bulletType = BulletTypeFactory.getBulletType(color);
		this.x = x;
		this.y = y;
	}

	public void display() {
		System.out.println("Bullets " + bulletType + " coordinates " + x + " " + y);
	}
}