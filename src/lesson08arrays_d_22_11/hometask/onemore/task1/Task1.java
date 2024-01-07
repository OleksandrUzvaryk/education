package lesson08arrays_d_22_11.hometask.onemore.task1;

import java.util.Arrays;

public class Task1 {



    public int [] reverseArrayCreateArray (int [] array){
        int [] reverseArray = new int[array.length];
        for (int i = 0; i <array.length ; i++) {
         reverseArray[i] = array[array.length-1-i];
        }return reverseArray;
    }

    public void reverseArray (int [] array){
        int temp=0;
        for (int i = 0; i <array.length/2 ; i++) {
            temp = array[array.length -1 -i];
            array[array.length -1 -i] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }


}
