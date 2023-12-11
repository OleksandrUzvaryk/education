package extratasks.addhomework6.array_for_loop.task13_summa_element;

import java.util.Arrays;
import java.util.Random;

public class Task13 {

  /*  - создайте массив целых чисел длиной 3,
            - заполните каждую ячейку массива случайным числом,
 - посчитайте сумму всех ячеек и распечатайте ее на консоль.
*/
    public static void main(String[] args) {

            Random random = new Random();
            int [] myArray = new int[3];

            myArray[0] = random.nextInt(100);
            myArray[1] = random.nextInt(100);
            myArray[2] = random.nextInt(100);

            System.out.println(Arrays.toString(myArray));

        System.out.println(myArray[0] + myArray[1] + myArray[2]);
        }
    }


