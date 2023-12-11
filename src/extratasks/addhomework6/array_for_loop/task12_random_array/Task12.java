package extratasks.addhomework6.array_for_loop.task12_random_array;

import java.util.Arrays;
import java.util.Random;

public class Task12 {
    /*Напишите программу, в которой:
            - создайте массив целых чисел длиной 3,
            - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль.*/

    public static void main(String[] args) {
        Random random = new Random();
        int [] myArray = new int[3];

        myArray[0] = random.nextInt(100);
        myArray[1] = random.nextInt(100);
        myArray[2] = random.nextInt(100);

        System.out.println(Arrays.toString(myArray));

        System.out.println("First - " + myArray[0]);
        System.out.println("Second - " + myArray[1]);
        System.out.println("Third - " + myArray[2]);
        }
    }


