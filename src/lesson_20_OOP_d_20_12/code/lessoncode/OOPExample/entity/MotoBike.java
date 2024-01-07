package lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.entity;

import lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.interfaces.GearShift;

public class MotoBike extends MotorizedVehicle{
    public MotoBike(String model, Integer speed, Engine engine, GearShift gearShift) {
        super(model, speed, engine, gearShift);
    }
}
