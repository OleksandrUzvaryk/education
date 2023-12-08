package lesson06Ifelse.condition_operator;

import java.util.Scanner;

public class ConditionOperators3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Please print 'x' value -> ");
        x = scanner.nextInt();

        // определить в какой диапазон входит число, 0-100, 100-200, в какой то другой диапазон
        if (x >= 0) {
            if (x <= 100) {
                System.out.println("Diapason 1");
            } else if (x <= 200) {
                System.out.println("Diapason 2");
            } else
                System.out.println("Out of range!");}
         else
            System.out.println("Out of range! (negative)");

        if (x >= 0 && x <= 100) {
            System.out.println("Diapason 1");
        } else if (x > 100 && x <= 200) {
            System.out.println("Diapason 2");
        } else {
            System.out.println("Out of range");
        }

        System.out.println((true && true) && (true || false));

    }
}
