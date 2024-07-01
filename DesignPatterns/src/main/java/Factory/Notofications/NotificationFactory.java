package Factory.Notofications;

public class NotificationFactory {

    public static Notification createNotification(NotificationType type, String message, String recipient, String sender) {
        return switch (type) {
            case EMAIL -> new EmailNotification(recipient, sender, message);
            case SMS -> new SmsNotification(recipient, message);
            case PUSH -> new PushNotification(recipient, message);
            default -> null;
        };
    }
}
