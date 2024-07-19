package com.factory.notifications;

public abstract class Notification {
    public String recipient;
    public String sender;

    public abstract NotificationType notificationType();

    public abstract void sendNotification();

    public abstract String getRecipient();

    public abstract String getMessage();
}