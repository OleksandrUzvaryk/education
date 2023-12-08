package lesson08arrays.array_examples;

import java.util.Arrays;

public class CarDemo {
    public static void main(String[] args) {

        Car car1 = new Car("producer1", "model1");
        Car car2 = new Car("producer2", "model2");
        Car car3 = new Car("producer3", "model3");
        Car car4 = new Car("producer4", "model4");
        Car car5 = new Car("producer5", "model5");
        Car car6 = new Car("producer6", "model6");
        Car car7 = new Car("producer7", "model7");
        Car car8 = new Car("producer8", "model8");
        Car car9 = new Car("producer9", "model9");
        Car car10 = new Car("producer10", "model10");

        Car[] garage1 = new Car[10];

        System.out.println(garage1);
        System.out.println(Arrays.toString(garage1));

        garage1[0] = car1;
        garage1[1] = car2;
        garage1[2] = car3;
        garage1[3] = car4;
        garage1[4] = car5;
        garage1[5] = car6;
        garage1[6] = car7;
        garage1[7] = car8;
        garage1[8] = car9;
        garage1[9] = car10;

        System.out.println(Arrays.toString(garage1));

        car5.setModel("Mercedes");

        System.out.println(car5);
        System.out.println(Arrays.toString(garage1));



    }
}
