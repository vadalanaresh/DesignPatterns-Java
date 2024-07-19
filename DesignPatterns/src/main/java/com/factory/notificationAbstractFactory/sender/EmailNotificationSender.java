package com.factory.notificationAbstractFactory.sender;


import com.factory.notificationAbstractFactory.NotificationType;
import com.factory.notificationAbstractFactory.notification.Notification;

public class EmailNotificationSender extends NotificationSender {

    public EmailNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Email notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
