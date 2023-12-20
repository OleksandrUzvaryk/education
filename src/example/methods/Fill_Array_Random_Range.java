package example.methods;

import java.util.Arrays;

public class Fill_Array_Random_Range {

    public static void main(String[] args) {

        // диапазон от 0 до 10 (Math.random() * 11);
        int[] myArray = new int[8];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(myArray));
        // замена нечетного числа 0
        for (int i = 0; i < myArray.length; i++)
            if (myArray[i] % 2 != 0) {
                myArray[i] = 0;
            }System.out.println(Arrays.toString(myArray));
    }

}
