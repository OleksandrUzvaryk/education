package lesson07loop_d_20_11.hometask.onemore.year;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        /*Цель: Определить, является ли год високосным.
         Условия: Год является високосным, если он делится на 4 без остатка, и либо не делится на 100, либо делится на 400.
        */
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if ((number%4 == 0 && number%100 != 0) || (number%400 == 0)) {
            System.out.println("Leap year");}
        else {
            System.out.println("Not leap year");
        }

    }
}
