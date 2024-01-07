package example.sorting;

import java.util.Arrays;

public class BubleSorting {

    public void bubbleSorting (int [] array){

        for (int i = 0; i <array.length -1; i++) {
            for (int j = 0; j <array.length-1-i; j++) {
                if (array[j+1] < array[j]){
                    int temporary = array[j];
                    array[j] = array[j+1];
                    array[j+1] =temporary;
                    System.out.println(Arrays.toString(array));
                }
            }
        }

    }

}
