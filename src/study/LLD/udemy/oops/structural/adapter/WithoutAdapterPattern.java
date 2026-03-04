package study.LLD.udemy.oops.structural.adapter;

//Problem: We have an email service using java email and now we want to change it to Sendgrid 
public class WithoutAdapterPattern {
	public static void main(String[] args) {
		NotificationService email = new JavaEmailService();
		email.send("abc@gmail.com", "Sent OTP", "OTP is 123456");
	}
}

interface NotificationService {
	void send(String to, String subject, String body);
}

class JavaEmailService implements NotificationService {

//	@Override  //why commenting out still works
	public void send(String to, String subject, String body) {
		System.out.println("Sending email using java mail : ");
		System.out.println("Sending to: " + to);
		System.out.println("Subject : " + subject);
		System.out.println("Content : " + body);
	}

}