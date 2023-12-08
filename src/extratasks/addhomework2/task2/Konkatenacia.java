package extratasks.addhomework2.task2;

import java.util.Scanner;

public class Konkatenacia {

    public static void main(String[] args) {
        String myName = "Aleks";
        String greeting = "Hi " + myName + " !!!";
        System.out.println(greeting);

        System.out.println("What is your name ? ");
        System.out.println("Put your name in console, please!");
        Scanner scanner = new Scanner(System.in);
        String myName2 = scanner.nextLine();
        System.out.println("My name is " + myName2);





    }
}
