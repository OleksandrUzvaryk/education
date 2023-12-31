package lesson_20_OOP_d_20_12.code.lessoncode.OOPExample.entity;

abstract class Vehicle {
    private String model;

    private Integer speed;

    abstract void accelerate();
    abstract void brake();

    public Vehicle(String model, Integer speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public Integer getSpeed() {
        return speed;
    }

    void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
