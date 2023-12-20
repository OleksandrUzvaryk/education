package lesson_18_abstraction_d_15_12.code.lessoncode.oop.abstraction.abstracCar;

abstract class Car {
    private String type;

    public Car(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    abstract void acceleration();


    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                '}';
    }
}
