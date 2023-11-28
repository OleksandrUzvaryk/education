package lesson07Loop.lessontasks.task2;

import java.util.Scanner;

//проверить является ли число которое ввел пользователь - простым
//(делится без остатка только на 1 и на себя)


public class SimpleNumberDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put your number :");
        int number = scanner.nextInt();
        SimpleNumber right = new SimpleNumber();
        boolean answer = right.isSimple(number);
        System.out.println("The number is simple: " + answer);

    }
}

