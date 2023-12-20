package lesson_19.messanger;

public class Telegram  implements Messenger{
    @Override
    public void send() {
        System.out.println("Send telegram");
    }

    @Override
    public void recive() {
        System.out.println("Recive telegram");
    }
}
