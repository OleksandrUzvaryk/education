package lesson_13_structure_app_d_04_12.code.lessoncode.carTruck;

public class Engine {
    String model;
    double volume;
    boolean isDiesel;

    public Engine(String model, double volume, boolean isDiesel) {
        this.model = model;
        this.volume = volume;
        this.isDiesel = isDiesel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", volume=" + volume +
                ", isDiesel=" + isDiesel +
                '}';
    }
}
