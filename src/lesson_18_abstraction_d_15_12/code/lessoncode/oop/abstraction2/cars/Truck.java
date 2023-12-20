package lesson_18_abstraction_d_15_12.code.lessoncode.oop.abstraction2.cars;

public class Truck extends Car {
    public Truck(String model, Integer speed) {
        super(model, speed);
    }

    @Override
    void speedUp() {
        System.out.println("Truck " + getModel() + " speedUp");
        setSpeed(getSpeed() + 3);
        System.out.println("Текущая скорость: " + getSpeed());
    }
}
