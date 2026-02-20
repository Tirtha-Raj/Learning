package study.LLD.udemy.oops.behavioural.mediator;

//We have to create a group chat where , when a single person sends message 
//	that message should reach to other users present in that group
public class WithoutMediatorPattern {

	public static void main(String[] args) {
		User ram = new User("Ram");
		
		User lakshman = new User("Lakshman");
		User sita = new User("Sita");
		
		sita.sendMessage("Need help", ram);
		sita.sendMessage("Need help", lakshman);
		
		
		ram.sendMessage("coming", sita);
		ram.sendMessage("coming", lakshman);
	}
}

class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public void sendMessage(String msg, User receipient) {
		System.out.println(this.name +" sending message : " + msg + " : to " + receipient.name);
	}

	public String getName() {
		return this.name;
	}
}
