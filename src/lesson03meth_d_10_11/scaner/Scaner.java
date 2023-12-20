package lesson03meth_d_10_11.scaner;

import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        // метод ввода из консоли - текст перед числами, поскольку джава запоминает предыдущие числа- Ентер тоже иммет числовое значение;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter text message :");
        String textMessage = input.nextLine();
        System.out.println("Your text is " + textMessage);

        System.out.println("Please enter integer number :");
        int number = input.nextInt();
        System.out.println("Your number is " + number);

        System.out.println("Please enter double number :");
        double numberDouble = input.nextDouble();
        System.out.println("Your number is " + numberDouble);
        input.close();















    }
}
