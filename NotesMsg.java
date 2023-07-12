package notificationsystem_java;

public class NotesMsg extends Notification{
    public NotesMsg(NotificationSend notificationSend) {
        super(notificationSend);
        System.out.println("Notes for you");
    }
    @Override
    void sendMsg() {
        notificationSend.sendNotificationServices();
    }
}
