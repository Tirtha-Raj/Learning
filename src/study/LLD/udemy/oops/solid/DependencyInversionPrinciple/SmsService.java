 package study.LLD.udemy.oops.solid.DependencyInversionPrinciple;

public class SmsService implements NotificationService{

	@Override
	public void send(String msg) {
		System.out.println("Sending SMS "+msg);
		
	}

}
