package lesson_19_polymorphism_interfaces_d_18_12.code.lessoncode.oop.examples;

public class Phone {
    private Messenger[] messengers;

    public Phone(Messenger[] messengers) {
        this.messengers = messengers;
    }

    public Messenger[] getMessengers() {
        return messengers;
    }
}
