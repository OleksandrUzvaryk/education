package example.interfaces.messenger;

public class Telegramm implements Messenger{
    @Override
    public void getingMessage() {
        System.out.println("Telegramm get message");
    }

    @Override
    public void setingMessage() {
        System.out.println("Telegramm set message");
    }
}
