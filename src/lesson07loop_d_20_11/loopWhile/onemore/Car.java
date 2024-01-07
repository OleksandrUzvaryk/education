package lesson07loop_d_20_11.loopWhile.onemore;

public class Car {
    String producer;
    String model;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
