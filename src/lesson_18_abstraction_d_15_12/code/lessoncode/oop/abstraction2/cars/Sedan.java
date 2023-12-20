package lesson_18_abstraction_d_15_12.code.lessoncode.oop.abstraction2.cars;

public class Sedan extends Car {




    public Sedan(String model, Integer speed) {
        super(model, speed);
    }


    @Override
    void speedUp() {
        System.out.println("Sedan " + getModel() + " speedUp");
        setSpeed(getSpeed() + 10);
        System.out.println("Текущая скорость: " + getSpeed());

    }
}
