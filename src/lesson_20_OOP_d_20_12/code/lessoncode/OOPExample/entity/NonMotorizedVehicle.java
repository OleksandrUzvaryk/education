package lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.entity;

public class NonMotorizedVehicle extends Vehicle {

    public NonMotorizedVehicle(String model, Integer speed) {
        super(model, speed);
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

}
