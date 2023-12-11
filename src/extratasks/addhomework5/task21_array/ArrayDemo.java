package extratasks.addhomework5.task21_array;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {

    public static void main(String[] args) {

        int [][] twoDimArray ;
        Random random = new Random();
         twoDimArray = new int[3][2];

         Array array = new Array();
        array.returnArray(twoDimArray);

        System.out.println(Arrays.toString(twoDimArray));
        //System.out.println(twoDimArray[0][0] +" , " + twoDimArray[0][1]);


    }
}


