package Factory.NotificationAbstractFactory;

import Factory.NotificationAbstractFactory.Notification.Notification;
import Factory.NotificationAbstractFactory.Sender.NotificationSender;
import Factory.NotificationAbstractFactory.Template.NotificationTemplate;

public abstract class NotificationFactory {
    public abstract NotificationType notificationType();
    public abstract Notification createNotification(String recipient, String sender, NotificationTemplate template);
    public abstract NotificationTemplate createTemplate(String templateName);
    public abstract NotificationSender createSender(Notification notification);
}