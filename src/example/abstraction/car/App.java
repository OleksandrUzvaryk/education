package example.abstraction.car;

public class App {
    public static void main(String[] args) {

        SportCar sportCar1 = new SportCar("Rerrari1", 110);
        SportCar sportCar2 = new SportCar("Rerrari2", 210);

        Sedan sedan1 = new Sedan("Toyota1" , 55);
        Sedan sedan2 = new Sedan("Toyota2" , 155);

        Truck truck1 = new Truck("Volvo1" , 13);
        Truck truck2 = new Truck("Volvo2" , 17);

        Car [] cars = {sportCar1,sportCar2,sedan1,sedan2,truck1,truck2};

        for (int i = 0; i < cars.length ; i++) {
            cars[i].rush();
        }

    }
}
