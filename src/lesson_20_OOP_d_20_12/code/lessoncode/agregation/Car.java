package lesson_20_OOP_d_20_12.code.lessoncode.agregation;

public class Car {
    private String carName;
    private Engine engine;

    public Car(String carName, Engine engine) {
        this.carName = carName;
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
        System.out.println(carName + " готов к поездке ");
    }
}
