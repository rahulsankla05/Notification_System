package notificationsystem_java;

public class SMS implements NotificationSend{
    @Override
    public void sendNotificationServices() {
        System.out.println("sent via RS_SMS Services");
    }
}
