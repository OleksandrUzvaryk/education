package example.abstraction.car;

public class Sedan extends Car {

    public Sedan(String model, int speed) {
        super(model, speed);
    }

    @Override
    void rush() {
        System.out.println("Sedan " + getModel()+ " rush!!!" );
        setSpeed(getSpeed() + 10);
        System.out.println("Speed in moment" + getSpeed());
    }
}
