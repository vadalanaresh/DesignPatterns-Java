package com.factory.notifications;

public class Client {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification(NotificationType.EMAIL, "this is sample email message", "naresh", "naresh@test.com");
        notification.sendNotification();

        notification = NotificationFactory.createNotification(NotificationType.PUSH,  "this is sample email message", "naresh", "naresh@test.com");
        notification.sendNotification();

        notification = NotificationFactory.createNotification(NotificationType.SMS,  "this is sample email message", "naresh", "naresh@test.com");
        notification.sendNotification();
    }
}
