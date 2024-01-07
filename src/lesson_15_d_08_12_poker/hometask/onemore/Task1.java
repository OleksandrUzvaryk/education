package lesson_15_d_08_12_poker.hometask.onemore;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        String [] myArray = {"A", "B", "C", "D", "E"};
        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < myArray.length/2; i++) {
            String temp = myArray[i];
            myArray[i] = myArray[myArray.length -1-i];
            myArray[myArray.length -1-i] = temp;
            System.out.println(myArray[i]);
        }
        System.out.println(Arrays.toString(myArray));

    }


}
