package example.interfaces.messenger;

public class Phone {

    Messenger [] myMessengers;

    public Phone(Messenger[] myMessengers) {
        this.myMessengers = myMessengers;
    }

    public Messenger[] getMyMessengers() {
        return myMessengers;
    }
}
