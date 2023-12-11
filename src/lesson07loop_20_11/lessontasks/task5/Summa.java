
package lesson07loop_20_11.lessontasks.task5;

import java.util.Scanner;

    public class Summa {
        public static void main(String[] args) {

            // Пользователь ввел число N. Подсчитайте количество четных и не четных чисел в диапазоне от 0 до N

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter integer number ");
            int number = scanner.nextInt();

            int sum = 0;
            int counter1 =0;
            int counter2 =0;

            for(int i = 0; i < number; i++) {
            if(i % 2 !=0){
                sum =  i;
                counter1++;
                System.out.println(counter1 + "-" + i);}}

            System.out.println("Amount of numbers: " + counter1);
            System.out.println("-----------------------------");
            for (int i = 0; i < number; i = i + 2) {

                sum = i;
                counter2++;
                System.out.println(counter2 + "-" + i);
            }
            System.out.println("Amount of numbers: " + counter2);
        }

    }


