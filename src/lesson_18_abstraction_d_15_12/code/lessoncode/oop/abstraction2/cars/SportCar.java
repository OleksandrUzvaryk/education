package lesson_18_abstraction_d_15_12.code.lessoncode.oop.abstraction2.cars;

public class SportCar extends Car {

    public SportCar(String model, Integer speed) {
        super(model, speed);
    }


    @Override
    void speedUp() {
        System.out.println("Sportcar " + getModel() + " speedUp");
        setSpeed(getSpeed() + 25);
        System.out.println("Текущая скорость: " + getSpeed());
    }
}
