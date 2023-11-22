package lesson07.lessontasks.task1;

import java.util.Random;
import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {

        // Подсчитать сумму всех четных чисел в диапазоне 0-N
        //при том что N вводится пользователем


        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean condition = true;

        System.out.println("Please enter integer number ");

        while (condition){
            int number = scanner.nextInt();
            if(number>=0){
                sum = sum + number;

            }else {
                condition = false;
            }
        }
        System.out.println("Sum all numbers is :" + sum);
    }
}


 /*   Random random = new Random();

        for (int i = 0; i < 10; i++) {
        if (i % 2 ==0){
        System.out.println(random.nextInt(100));
        }else {
        System.out.println(100 + random.nextInt(900));
        }

        }
*/
