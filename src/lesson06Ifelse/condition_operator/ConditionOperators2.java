package lesson06Ifelse.condition_operator;

import java.util.Scanner;

public class ConditionOperators2 {

    public static void main(String[] args) {
                        // задача на поиск четного и нечетного числа
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Please print 'x' value -> ");
        x = scanner.nextInt();

        boolean isEven = (x % 2 == 0);
        if (isEven){
            System.out.println("This number is even!");
        } else {
            System.out.println("This number is odd");
        }

    }
}
