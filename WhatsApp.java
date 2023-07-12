package notificationsystem_java;

public class WhatsApp implements NotificationSend{

    @Override
    public void sendNotificationServices() {
        System.out.println("sent via RS_WhatsApp Services");
    }
}
