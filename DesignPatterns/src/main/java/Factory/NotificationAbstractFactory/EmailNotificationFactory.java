package Factory.NotificationAbstractFactory;

import Factory.NotificationAbstractFactory.Notification.EmailNotification;
import Factory.NotificationAbstractFactory.Notification.Notification;
import Factory.NotificationAbstractFactory.Sender.EmailNotificationSender;
import Factory.NotificationAbstractFactory.Sender.NotificationSender;
import Factory.NotificationAbstractFactory.Template.EmailNotificationTemplate;
import Factory.NotificationAbstractFactory.Template.NotificationTemplate;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new EmailNotification(recipient, sender, template);
    }

    @Override
    public NotificationTemplate createTemplate(String templateName) {
        return new EmailNotificationTemplate(templateName);
    }

    @Override
    public NotificationSender createSender(Notification notification) {
        return new EmailNotificationSender(notification);
    }
}
