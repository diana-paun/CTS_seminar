package ro.ase.csie.cts.seminar3;

public class SMSNotificationService implements NotificationService {

	@Override
	public void sendNotification(Person destination, String msg) {
		System.out.println("Sending sms to " + destination.getEmail());
		System.out.println(msg);
	
	}

}
