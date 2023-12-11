package lesson_15_08_12.hometask.task6;

import java.util.Arrays;

public class Task6 {


    public static void main(String[] args) {



        int[] myArray = new int[8];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < myArray.length; i++)
            if (myArray[i] % 2 != 0) {
                myArray[i] = 0;
            }System.out.println(Arrays.toString(myArray));
    }




}
