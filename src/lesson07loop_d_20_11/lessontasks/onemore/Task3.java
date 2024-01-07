package lesson07loop_d_20_11.lessontasks.onemore;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
       //  Используйте цикл, чтобы просуммировать все числа, которые ввел пользователь, до первого отрицательного.

        Scanner scanner = new Scanner(System.in);
        int summa = 0;
        boolean conditions = true;

        System.out.println("Please enter your number");

        while (conditions){
            int number = scanner.nextInt();
            if (number>=0){summa = summa + number;
                System.out.println("In moment summa is " + summa);}
            else {conditions = false;
                System.out.println("You put negative number");}
        }
        System.out.println("All summa is " + summa);



    }



}
