package Factory.NotificationAbstractFactory.Sender;


import Factory.NotificationAbstractFactory.Notification.Notification;
import Factory.NotificationAbstractFactory.NotificationType;

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
