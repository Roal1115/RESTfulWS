package utm.repository;

import java.util.List;

import utm.model.Notification;

public interface NotificationRepository {
	
	public List<Notification> getNotifications();
	public Notification getNotification(String Id);
	public Notification createNotification(String Id, String subject, String message,
			List<String> toAddress, List<String> ccAddress);
	public Notification updateNotification(String Id, Notification notification);
	public void addNotification(Notification notification);
	
}
