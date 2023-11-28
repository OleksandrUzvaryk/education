package lesson07Loop.hometask.task4findleapyear;

import java.util.Scanner;

public class YearDemo {
    public static void main(String[] args) {

        System.out.println("Put your year");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if ((number % 4 == 0 ) && (number % 100 != 0) || (number % 400 == 0)) {
            System.out.println("Leap year");
        } else{
            System.out.println("Not leap year");
        }

    }
    }
/*
Условия: Год является високосным, если он делится на 4 без остатка, и либо не делится на 100, либо делится на 400.*/
