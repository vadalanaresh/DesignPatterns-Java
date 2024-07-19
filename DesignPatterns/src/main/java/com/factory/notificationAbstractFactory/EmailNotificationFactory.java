package com.factory.notificationAbstractFactory;

import com.factory.notificationAbstractFactory.notification.EmailNotification;
import com.factory.notificationAbstractFactory.notification.Notification;
import com.factory.notificationAbstractFactory.sender.EmailNotificationSender;
import com.factory.notificationAbstractFactory.sender.NotificationSender;
import com.factory.notificationAbstractFactory.template.EmailNotificationTemplate;
import com.factory.notificationAbstractFactory.template.NotificationTemplate;

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
