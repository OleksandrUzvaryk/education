package lesson_19_polymorphism_interfaces_d_18_12.code.lessoncode.oop.examples;

public class Telegram implements Messenger{
    @Override
    public void getMessage() {
        System.out.println("Telegram message receiving");
    }

    @Override
    public void sendMessage() {
        System.out.println("Telegram message sending");
    }
}
