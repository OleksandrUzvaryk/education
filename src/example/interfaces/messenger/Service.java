package example.interfaces.messenger;

public class Service {


    void serviceMessenger (Messenger []messengers){
        for (int i = 0; i < messengers.length ; i++) {
            messengers[i].getingMessage();
            messengers[i].setingMessage();
        }
    }
}
