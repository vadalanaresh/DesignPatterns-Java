package com.factory.notificationAbstractFactory;

import com.factory.notificationAbstractFactory.notification.Notification;
import com.factory.notificationAbstractFactory.sender.NotificationSender;
import com.factory.notificationAbstractFactory.template.NotificationTemplate;

public abstract class NotificationFactory {
    public abstract NotificationType notificationType();
    public abstract Notification createNotification(String recipient, String sender, NotificationTemplate template);
    public abstract NotificationTemplate createTemplate(String templateName);
    public abstract NotificationSender createSender(Notification notification);
}