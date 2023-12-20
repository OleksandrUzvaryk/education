package lesson_18_abstraction_d_15_12.code.lessoncode.oop.abstraction.abstracCar;

public class SportCar extends Car {
    public SportCar(String type) {
        super(type);
    }

    @Override
    void acceleration() {
        System.out.println("Frrrrrrr!!!!!");
    }
}
