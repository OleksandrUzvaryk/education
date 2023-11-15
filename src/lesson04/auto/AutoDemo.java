package lesson04.auto;

import lesson04.auto.Auto;

public class AutoDemo {

    public static void main(String[] args) {

        Auto newAuto1 = new Auto("Mercedes",2.5,"Black",true);
        System.out.println(newAuto1.model);
        System.out.println(newAuto1.transmissionType);


        newAuto1.sound();
        newAuto1.startEngine();
        newAuto1.offEngine();



    }
}
