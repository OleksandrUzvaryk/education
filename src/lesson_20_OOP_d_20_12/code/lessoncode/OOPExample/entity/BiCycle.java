package lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.entity;

import lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.interfaces.GearShift;
import lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.interfaces.GearShiftOperation;

public class BiCycle extends NonMotorizedVehicle implements GearShiftOperation {

    private GearShift gearShift;

    public BiCycle(String model, Integer speed, GearShift gearShift) {
        super(model, speed);
        this.gearShift = gearShift;
    }

    @Override
    public void changeGear(boolean isUp) {
        Integer currentGear = gearShift.getCurrentGear();

        if (isUp) {
            gearShift.setCurrentGear(currentGear + 1);
        } else {
            gearShift.setCurrentGear(currentGear - 1);
        }
    }
}
