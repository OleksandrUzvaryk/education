package lesson_15_d_08_12_poker.hometask.task5;

import java.util.Arrays;
import java.util.Random;

public class Task5 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] intArray = new int[12];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(-15,16);
        }
        System.out.println(Arrays.toString(intArray));

        int max = intArray[0];
        int indexMax = -1;

        for (int i = 0; i < intArray.length; i++) {   // сравнивание при минимуме с 1 позиции цыкла
            if(intArray[i]>max){
                max = intArray[i];
                indexMax = i;
            }
        }
        System.out.println("Max from array = " + max + " index = " + indexMax);
    }
}

