package example.array.fillarray;

import extratasks.addhomework5.task21_array.Array;

import java.util.Arrays;
import java.util.Scanner;

public class FillArrayScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put yoyr arrays size");
        int araySize = scanner.nextInt();
        int [] myA = new int[araySize];

        for (int i = 0; i <myA.length ; i++) {
            System.out.println("Please put the numbers!");
            myA[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(myA));

    }
}
