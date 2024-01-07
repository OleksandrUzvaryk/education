package lesson07loop_d_20_11.loopWhile.onemore;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        // попросить у пользователя 2 целых числа, вывести их суму и напечатать, пока сумма меньше 100

        int first;
        int second;
        boolean condition = true;
        int counter = 0;

        while (condition) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Put 1 number: ");
            first = scanner.nextInt();
            System.out.println("Put 2 number: ");
            second = scanner.nextInt();
            System.out.println("Our sum is " + (first + second));
            if ((first + second) <= 100) {
                System.out.println("Once more");
            }
            if ((first + second) > 100) condition = false;
            counter++;
        }

    }
}
