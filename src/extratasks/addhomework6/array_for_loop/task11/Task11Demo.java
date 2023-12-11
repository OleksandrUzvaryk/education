package extratasks.addhomework6.array_for_loop.task11;

import java.util.Arrays;

public class Task11Demo {

   /* Напишите программу, в которой:
            - создайте массив целых чисел длиной 3,
            - заполните каждую ячейку массива числом, запрошенным у пользователя,
            - выведите значение каждой ячейки на консоль.
    */

    public static void main(String[] args) {


        Task11 method = new Task11();
        int sizeArray = 3;
        int [] myArray = new int[sizeArray];
        System.out.println("Please put first element of your Array");
        myArray [0] = method.uiInt();
        System.out.println("Please put second element of your Array");
        myArray [1] = method.uiInt();
        System.out.println("Please put third element of your Array");
        myArray [2] = method.uiInt();

        System.out.println(Arrays.toString(myArray));
    }
}
