package lesson_19_polymorphism_interfaces_d_18_12.code.lessoncode.oop.polimorfizm.garage;

public class SportCar extends Car {
    public SportCar(String model, Integer speed) {
        super(model, speed);
    }

    @Override
    void speedUp() {
        System.out.println("SportCar " + getModel() + " speedUp!");
        setSpeed(getSpeed() + 25);
        System.out.println("Текущая скорость: " + getSpeed());
    }

    @Override
    public void soundBeep() {

    }
}
