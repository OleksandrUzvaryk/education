package lesson07loop_d_20_11.lessontasks.onemore;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        //Подсчитать сумму всех четных чисел от 0 до N при том что N вводится пользователем

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put your number!");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <number ; i= i+2) {
         sum = sum + i;
        }
        System.out.println("Our sum is " + sum);

    }
}
