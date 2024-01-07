package example.interfaces.messenger;

public class WhatsApp implements Messenger{
    @Override
    public void getingMessage() {
        System.out.println("WhatsApp get message");
    }

    @Override
    public void setingMessage() {
        System.out.println("WhatsApp set message");
    }
}
