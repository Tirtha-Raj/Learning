package study.LLD.udemy.oops.solid.DependencyInversionPrinciple;

public class SendNotification {

	public static void main(String[] args) {
		NotificationChannel ns = new NotificationChannel(new EmailService());
		ns.notify("Product OK");
		
		NotificationChannel nSms= new NotificationChannel(new SmsService());
		nSms.notify("OTP 12345");
	}
}
