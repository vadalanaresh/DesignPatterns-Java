package Factory.NotificationAbstractFactory;

import Factory.NotificationAbstractFactory.Notification.Notification;
import Factory.NotificationAbstractFactory.Notification.PushNotification;
import Factory.NotificationAbstractFactory.Sender.NotificationSender;
import Factory.NotificationAbstractFactory.Sender.PushNotificationSender;
import Factory.NotificationAbstractFactory.Template.NotificationTemplate;
import Factory.NotificationAbstractFactory.Template.PushNotificationTemplate;

public class PushNotificationFactory extends NotificationFactory {

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new PushNotification(recipient, template);
    }

    @Override
    public NotificationTemplate createTemplate(String templateName) {
        return new PushNotificationTemplate(templateName);
    }

    @Override
    public NotificationSender createSender(Notification notification) {
        return new PushNotificationSender(notification);
    }
}
