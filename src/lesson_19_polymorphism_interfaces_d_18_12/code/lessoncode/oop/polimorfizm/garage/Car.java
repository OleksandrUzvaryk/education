package lesson_19_polymorphism_interfaces_d_18_12.code.lessoncode.oop.polimorfizm.garage;

abstract class Car implements Beep{

    private String model;

    private Integer speed;

    public Car(String model, Integer speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    abstract void speedUp();

}
