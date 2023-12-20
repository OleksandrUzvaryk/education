package lesson_19.messanger;

public class Viber implements Messenger{
    @Override
    public void send() {
        System.out.println("Send viber");
    }

    @Override
    public void recive() {
        System.out.println("Recive viber");
    }
}
