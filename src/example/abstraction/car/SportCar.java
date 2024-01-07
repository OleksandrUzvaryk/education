package example.abstraction.car;

public class SportCar extends  Car {

    public SportCar(String model, int speed) {
        super(model, speed);
    }


    @Override
    void rush() {
        System.out.println("Sportcar " + getModel()+ " rush!!!" );
        setSpeed(getSpeed() + 50);
        System.out.println("Speed in moment" + getSpeed());

    }
}
