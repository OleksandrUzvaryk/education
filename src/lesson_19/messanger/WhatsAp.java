package lesson_19.messanger;

public class WhatsAp implements Messenger{
    @Override
    public void send() {
        System.out.println("Send whatsAp");
    }

    @Override
    public void recive() {
        System.out.println("Recive whatsAp");
    }
}
