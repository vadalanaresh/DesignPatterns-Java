package com.factory.notificationAbstractFactory.sender;


import com.factory.notificationAbstractFactory.NotificationType;
import com.factory.notificationAbstractFactory.notification.Notification;

public abstract class NotificationSender {
    private final Notification notification;

    public NotificationSender(Notification notification) {
        this.notification = notification;
    }

    public Notification getNotification() {
        return notification;
    }

    public abstract void send();

    public abstract NotificationType notificationType();

}
