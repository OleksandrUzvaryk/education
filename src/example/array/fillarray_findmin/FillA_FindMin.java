package example.array.fillarray_findmin;

import java.util.Arrays;
import java.util.Random;

public class FillA_FindMin {
    public static void main(String[] args) {
        Random random= new Random();
        int [] myArray = new int[15];

        for (int i = 0; i < myArray.length ; i++) {
            myArray[i]= random.nextInt(100);
        }
        System.out.println(Arrays.toString(myArray));

        int min = myArray[0];
        int indexMin = 0;

        for (int i = 0; i < myArray.length ; i++) {
            if(myArray[i]<min){
                min = myArray[i];
                indexMin=i;
            }
        }
        System.out.println("Minimum is - " + min + " index " + indexMin);


    }
}
