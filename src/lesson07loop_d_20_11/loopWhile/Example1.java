package lesson07loop_d_20_11.loopWhile;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
    // попросить у пользователя 2 целых числа, вывести их суму и напечатать, пока сумма меньше 100

        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        boolean condition = true;


        while (condition){

            System.out.println("Please enter 2 numbers ");
            System.out.println("Please enter 1 number: ");
            x = scan.nextInt();
            System.out.println("Please enter 2 number: ");
            y= scan.nextInt();

            System.out.println("Add result = " + (x + y));

            if ((x+y)>100) condition = false;
        }
        System.out.println("Finish loop while!");



    }
}
