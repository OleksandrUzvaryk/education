package lesson_19_polymorphism_interfaces_d_18_12.code.lessoncode.oop.polimorfizm.garage;

public class Truck extends Car {
    public Truck(String model, Integer speed) {
        super(model, speed);
    }

    @Override
    void speedUp() {
        System.out.println("Our Truck " + getModel() + " speedUp!");
        setSpeed(getSpeed() + 3);
        System.out.println("Текущая скорость: " + getSpeed());
    }

    @Override
    public void soundBeep() {

    }
}
