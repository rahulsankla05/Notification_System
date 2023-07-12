package notificationsystem_java;
// EMAIL it's an Implementation of Abstract Notification sending Methods//

public class Email implements NotificationSend{
    @Override
    public void sendNotificationServices() {
        System.out.println("sent via RS_EMAIL Services");
    }
}
