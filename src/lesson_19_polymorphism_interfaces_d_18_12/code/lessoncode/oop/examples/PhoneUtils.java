package lesson_19_polymorphism_interfaces_d_18_12.code.lessoncode.oop.examples;

public class PhoneUtils {

    public void messengerService(Messenger[] messengers) {
        for (int i = 0; i < messengers.length; i++) {
            messengers[i].getMessage();
            messengers[i].sendMessage();
        }
    }
}
