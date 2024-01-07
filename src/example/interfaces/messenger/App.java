package example.interfaces.messenger;

public class App {

    public static void main(String[] args) {

        Messenger []messengers = {new Telegramm(), new Viber(), new WhatsApp(), new Signal()};
        Phone myPhone = new Phone(messengers);
        Service service= new Service();
        service.serviceMessenger(myPhone.getMyMessengers());
        System.out.println("_____________________________");
        service.serviceMessenger(messengers);


    }
}
