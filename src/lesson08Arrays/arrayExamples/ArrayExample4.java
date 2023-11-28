package lesson08Arrays.arrayExamples;

import java.util.Arrays;

public class ArrayExample4 {
    public static void main(String[] args) {

        int [][] twoDimArray = {{1,2,3,4}, {5,6},{7,8,9,10,11,12}};
        System.out.println(Arrays.toString(twoDimArray));
        System.out.println(Arrays.toString(twoDimArray[0]));
        System.out.println(Arrays.toString(twoDimArray[1]));
        System.out.println(Arrays.toString(twoDimArray[2]));

        for (int i = 0; i < twoDimArray.length; i++) {  // і будет прокручивать диапазон 0-2
            for (int j = 0; j < twoDimArray[i].length; j++) {  // j будет прокручивать диапазоны 1-4, 5-6, 7-12

                System.out.println("Element " + i + " line " + j + " column " + twoDimArray[i][j]);
            }
        }
    }
}
