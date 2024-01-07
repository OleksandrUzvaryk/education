package example.abstraction.car;

public class Truck extends  Car {


    public Truck(String model, int speed) {
        super(model, speed);
    }

    @Override
    void rush() {
        System.out.println("Truck " + getModel()+ " rush!!!" );
        setSpeed(getSpeed() + 5);
        System.out.println("Speed in moment" + getSpeed());

    }
}
