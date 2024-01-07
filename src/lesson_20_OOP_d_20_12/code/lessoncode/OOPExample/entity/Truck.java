package lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.entity;

import lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.interfaces.GearShift;

public class Truck extends MotorizedVehicle{
    public Truck(String model, Integer speed, Engine engine, GearShift gearShift) {
        super(model, speed, engine, gearShift);
    }
}
