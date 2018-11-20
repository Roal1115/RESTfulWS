package utm.service;

import java.util.List;

import utm.model.Notification;

public interface NotificationService {
	public void notify(String subject, String message, List<String> toAddress, List<String> ccAddress);
	public List<Notification> getNotifications();
}
