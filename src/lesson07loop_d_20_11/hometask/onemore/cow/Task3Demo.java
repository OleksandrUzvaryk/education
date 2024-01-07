package lesson07loop_d_20_11.hometask.onemore.cow;

import java.util.Scanner;

public class Task3Demo {
    public static void main(String[] args) {

       /* Цель: Склонение слова "корова" в зависимости от числа n.
                Входные данные: Целое положительное число n (n ≤ 10).
        Выходные данные: Фраза "На лугу пасется n коров(а/ы)".

        */
   Task3 service = new Task3();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put your number 0 -10");
        int number = scanner.nextInt();
        System.out.println(service.cowMethod(number));

    }
}
