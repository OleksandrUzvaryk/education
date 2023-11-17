package lesson05.hometask;

import java.util.Scanner;

public class Task4MyName {

    public static void main(String[] args) {

        String myName = "Aleksandr";
        System.out.println(myName);

        String myName2 = "Roman";
        System.out.println("Hi Your Name is : " + myName2);

        Scanner inPutYname = new Scanner(System.in);

        System.out.println("Input Your Name : ");
        String userName = inPutYname.nextLine();
        System.out.println("Hi YourName!");
        System.out.println("Hallo " + userName+ "!");

    }

}
