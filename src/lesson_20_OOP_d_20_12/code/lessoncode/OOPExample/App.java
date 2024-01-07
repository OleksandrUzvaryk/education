package lesson_20_OOP_d_20_12.code.lessoncode.OOPExample;

import lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.entity.Car;
import lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.entity.Engine;
import lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.entity.Scooter;
import lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.interfaces.GearShift;

public class App {
    public static void main(String[] args) {

        Car car = new Car("Mercedes S600 1998", 20, new Engine("V12 engine"),new GearShift("automatic 6 gear"));
        car.startEngine();
        car.accelerate();
        car.brake();
        car.brake();
        car.brake();
        car.stopEngine();


        Scooter scooter = new Scooter("noname", 25);
        scooter.accelerate();
        scooter.brake();
        scooter.brake();
        scooter.brake();
        scooter.brake();
    }
}
