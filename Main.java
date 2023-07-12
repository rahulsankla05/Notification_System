package notificationsystem_java;

public class Main {
    public static void main(String[] args) {
//        NotesMsg notesMsg = new NotesMsg(new Email());
//        notesMsg.sendMsg();

        TextMsg textMsg = new TextMsg(new WhatsApp());
        textMsg.sendMsg();
    }
}
