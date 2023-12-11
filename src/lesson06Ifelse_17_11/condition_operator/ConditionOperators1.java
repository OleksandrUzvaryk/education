package lesson06Ifelse_17_11.condition_operator;

import java.util.Scanner;

public class ConditionOperators1 {
    public static void main(String[] args) {
                // задача на поиск диапазона числа больше, меньше или равно 0
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Please enter 'x' value ->");
        x = scanner.nextInt();

        if (x > 0){
            System.out.println("x > 0");
        } else if (x < 0){
            System.out.println("x < 0");
        } else {
            System.out.println("x = 0 !!!");
        }
    }
}
