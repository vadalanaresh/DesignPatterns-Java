package com.factory.notificationAbstractFactory;

import com.factory.notificationAbstractFactory.notification.Notification;
import com.factory.notificationAbstractFactory.notification.PushNotification;
import com.factory.notificationAbstractFactory.sender.NotificationSender;
import com.factory.notificationAbstractFactory.sender.PushNotificationSender;
import com.factory.notificationAbstractFactory.template.NotificationTemplate;
import com.factory.notificationAbstractFactory.template.PushNotificationTemplate;

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
