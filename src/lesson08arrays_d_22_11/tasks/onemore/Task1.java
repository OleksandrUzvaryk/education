package lesson08arrays_d_22_11.tasks.onemore;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       /* 1. Создать массив размера , полученного от пользователя
        Наполнить этот массив случайными числами в диапазоне до 100
                - найти максимум среди элементов массива и его индекс (если значения повторяются то найти первый)
                - найти сумму всех элементов

                **
        если максимальный элемент повторяется несколько раз то создать массив из индесов

        в идеале - оформить основные модули вашей программы отдельными методами*/

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please pur array size");
        int arraySize = scanner.nextInt();
        int [] myA = new int[arraySize];
        ArrayOperation service = new ArrayOperation();

        service.fillArrayByRandom(myA,100);
        System.out.println(Arrays.toString(myA));

        int sum = service.sumArray(myA);
        System.out.println("Sum my Araay is - " + sum);

        int max = service.findMax(myA);
        System.out.println("Max of my Array is - " +max);

        ArrayResult maxAndIndex = service.findMaxElementFindIndex(myA);
        System.out.println("Max element  - " + maxAndIndex.getMaxElement() + " Max index " + maxAndIndex.getIndexMaxElement() );

        service.makeIndexMaxArray(myA);
        System.out.println("Array index - " + Arrays.toString(service.makeIndexMaxArray(myA)));













    }

}
