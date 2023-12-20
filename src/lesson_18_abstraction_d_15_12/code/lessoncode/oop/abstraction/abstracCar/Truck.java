package lesson_18_abstraction_d_15_12.code.lessoncode.oop.abstraction.abstracCar;

public class Truck extends Car{
    public Truck(String type) {
        super(type);
    }

    @Override
    void acceleration() {
        System.out.println("SHHHHHHH!!!!!");
    }
}
