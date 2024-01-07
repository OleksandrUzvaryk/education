package lesson07loop_d_20_11.lessontasks.onemore;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        // Пользователь ввел число N. Подсчитайте количество четных и не четных чисел в диапазоне от 0 до N

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int loopNumber = 0;

        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < number; i++) {
            if (i % 2 != 0) {
                loopNumber = i;
                counter1++;
                System.out.println(counter1 + " " + loopNumber);
            }
        }
        System.out.println("All amount  number - " + counter1);

        for (int i = 0; i < number; i= i + 2) {

                loopNumber = i;
                counter2++;
            System.out.println(counter2 + " " + loopNumber);
        }System.out.println("All amount  number - " + counter2);

    }

}
