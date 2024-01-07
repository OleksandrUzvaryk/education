package lesson07loop_d_20_11.lessontasks.task1;

import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {

        // Подсчитать сумму всех четных чисел в диапазоне 0-N
        //при том что N вводится пользователем

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter integer number ");
        int number = scanner.nextInt();

        int sum = 0;
        //int counter =0;

        for (int i = 0; i < number; i = i + 2) {

            //counter ++;
            sum = sum + i;

            }
        System.out.println("Сумма четных чисел в диапазоне составит : " + sum);
    }

}

