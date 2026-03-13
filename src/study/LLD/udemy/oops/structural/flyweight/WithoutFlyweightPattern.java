package study.LLD.udemy.oops.structural.flyweight;

//Problem : We need to built a game where need to render images of bullets, 
//	if we render images every time, it would take cost of creating duplicate object overhead, solve this
public class WithoutFlyweightPattern {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			Bullet bullet = new Bullet("Red", 2*i, 3*i);
			bullet.display();
		}
		
		for(int i=0;i<5;i++) {
			Bullet bullet = new Bullet("Green", 10*i, 20*i);
			bullet.display();
		}
		//Everytime storing color/Images not required
	}
}

class Bullet {

	private String color; //Intrinsic property : Same across all object //Bullet Images
	private int x;		//Extrinsic property : unique for each object
	private int y;		

	public Bullet(String color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public void display() {
		System.out.println("Bullets color:" + color + " coordinates " + x + " " + y);
	}
}