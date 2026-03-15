package study.LLD.udemy.oops.solid.DependencyInversionPrinciple;

public class NotificationChannel {

	private NotificationService notifiService;
	
	public NotificationChannel(NotificationService notifiServices) {
		this.notifiService = notifiServices;
	}
	
	public void notify(String msg) {
		notifiService.send(msg);
	}
}
