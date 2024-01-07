package lesson_15_d_08_12_poker.hometask.onemore;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array size more than 3");
        int n=0;
        boolean work = true;

        while (work) {
            n = scanner.nextInt();
            if (n <= 3) {
                System.out.println("One more!");}
            else  {
                System.out.println("Range is 0 - " + n);
                work = false;
            }
        }

        int [] array = new int[n];
        int evenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n+1);
            if (array[i] % 2 == 0){
                evenNumbers++;}
        }System.out.println(Arrays.toString(array));


        int[] array2 = new int[evenNumbers];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array2[counter] = array[i];
                counter++;
            }
        }System.out.println(Arrays.toString(array2));


    }

}



