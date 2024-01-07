package example.interfaces.messenger;

public class Signal implements Messenger{
    @Override
    public void getingMessage() {
        System.out.println("Signal get message");
    }

    @Override
    public void setingMessage() {
        System.out.println("Signal set message");
    }
}
