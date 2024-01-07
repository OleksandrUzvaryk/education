package lesson07loop_d_20_11.loopWhile.onemore;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {


        // создать меню

        boolean condition = true;

        while (condition){

            System.out.println("Please make your choise ");
            System.out.println("1.Car");
            System.out.println("2.Motocycle");
            System.out.println("3.Boat");
            System.out.println("4.Train");
            System.out.println("5.Exit");

            Scanner scanner = new Scanner(System.in);
            int choise = scanner.nextInt();

            switch (choise){
                case 1:
                    System.out.println("Your choise is car!"); break;
                case 2:
                    System.out.println("Your choise is motocycle!"); break;
                case 3:
                    System.out.println("Your choise is boat!"); break;
                case 4:
                    System.out.println("Your choise is train!"); break;
                case 5:
                    System.out.println("Your choise is Exit!"); condition = false; break;
            }

        }
        System.out.println("Finish loop");








    }





}
