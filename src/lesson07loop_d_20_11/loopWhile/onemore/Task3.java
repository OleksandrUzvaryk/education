package lesson07loop_d_20_11.loopWhile.onemore;

import lesson07loop_d_20_11.loopWhile.Cat;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        boolean condition = true;

        while (condition) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please create car");
            System.out.println("Put your producer");
            String producer = scanner.nextLine();
            System.out.println("Put your model");
            String model = scanner.nextLine();

            if ((producer.equals("")) && (model.equals(""))) {
                condition = false;
                System.out.println("End!!!");
            } else {
                Car car = new Car(producer, model);
                System.out.println(car);
            }

        }
    }
}
