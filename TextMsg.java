package notificationsystem_java;

public class TextMsg extends Notification{
    // constructor//
    public TextMsg(NotificationSend notificationSend) {
        super(notificationSend);
        System.out.println("Text msg for you");
    }
// calling sending notification method for textmsgs//
    @Override
    void sendMsg() {
        notificationSend.sendNotificationServices();
    }
}
