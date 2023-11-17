package lesson05.publicAndPrivat.car;

import lesson05.publicAndPrivat.car.entity.Car;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Glc250";
        //car.color = "Black"; - недоступен пока не будет паблик



    }
}
