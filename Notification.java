package notificationsystem_java;

public abstract class Notification {
    NotificationSend notificationSend ;

    public Notification(NotificationSend notificationSend){
        this.notificationSend =notificationSend;
    }
    // every notification will have its own way //
    abstract void sendMsg();
}
