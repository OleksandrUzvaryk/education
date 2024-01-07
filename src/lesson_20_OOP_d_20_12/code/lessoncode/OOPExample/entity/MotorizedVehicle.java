package lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.entity;

import lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.interfaces.EngineOperation;
import lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.interfaces.GearShift;
import lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.interfaces.GearShiftOperation;

public class MotorizedVehicle extends Vehicle implements EngineOperation, GearShiftOperation {
    private Engine engine;
    private GearShift gearShift;

    public MotorizedVehicle(String model, Integer speed, Engine engine, GearShift gearShift) {
        super(model, speed);
        this.engine = engine;
        this.gearShift = gearShift;
    }


    @Override
    public void accelerate() {
        setSpeed(getSpeed() + 10);
        System.out.println("Accelerate. Current speed: " + getSpeed());
    }

    @Override
    public void brake() {
        if (getSpeed() > 10) {
        setSpeed(getSpeed() - 10);
        System.out.println("Brake. Current speed: " + getSpeed());}
        else {
            setSpeed(0);
            System.out.println(getModel() + " stopped.");}
        }

    @Override
    public void startEngine() {
        if (engine.getEngineParameters().startsWith("V12")) {
            System.out.println("Start V12 engine");
        } else {
            System.out.println("Start simple engine");
        }
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop engine");
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
