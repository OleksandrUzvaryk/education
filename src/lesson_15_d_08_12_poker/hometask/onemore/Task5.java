package lesson_15_d_08_12_poker.hometask.onemore;

import java.util.Arrays;
import java.util.Random;

public class Task5 {

    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[12];
        for (int i = 0; i <array.length ; i++) {
            array[i] = random.nextInt(-15,16);
        }
        System.out.println(Arrays.toString(array));

        int max = array[0];
        int index = 0;

        for (int i = 0; i <array.length ; i++) {
            if(array[i]>max){
                max = array[i];
                index = i;
            }
        }
        System.out.println("Max is " + max + " his index is " + index);

    }
}
