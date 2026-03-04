package study.LLD.udemy.oops.structural.adapter;

public class WithAdapterPattern {
	public static void main(String[] args) {
		NotificationService email = new JavaEmailService();
		email.send("abc@gmail.com", "Sent OTP", "OTP is 123456");
		
		email = new SendgridAdapter(new SendgridEmailService());
		email.send("abc@gmail.com", "Sent OTP", "OTP is 123456");
	}
}

class SendgridAdapter implements NotificationService {

	private SendgridEmailService sendgridEmailService;

	public SendgridAdapter(SendgridEmailService sendgridService) {
		this.sendgridEmailService = sendgridService;
	}

	@Override
	public void send(String to, String subject, String body) {
		sendgridEmailService.sendEmail(subject, to, body);
	}

}

class SendgridEmailService {

	public void sendEmail(String subject, String recipient, String body) {
		System.out.println("Sending email using Sendgrid : ");
		System.out.println("Sending to: " + recipient);
		System.out.println("Subject : " + subject);
		System.out.println("Content : " + body);
	}
}