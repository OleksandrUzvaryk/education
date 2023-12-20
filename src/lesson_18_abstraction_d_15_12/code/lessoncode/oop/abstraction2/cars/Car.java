package lesson_18_abstraction_d_15_12.code.lessoncode.oop.abstraction2.cars;

abstract class Car {
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

    abstract void speedUp ();


}
