package lesson_15_d_08_12_poker.hometask.onemore;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {

        Random random = new Random();
        int [] array = new int[8];

        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(0,11);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length ; i++) {
            if (array[i]%2 !=0){
                array[i] = 0;
            }
        }System.out.println(Arrays.toString(array));

    }
}
