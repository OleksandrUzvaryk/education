package example.interfaces.messenger;

public class Viber implements Messenger{
    @Override
    public void getingMessage() {
        System.out.println("Viber get message");
    }

    @Override
    public void setingMessage() {
        System.out.println("Viber set message");
    }
}
