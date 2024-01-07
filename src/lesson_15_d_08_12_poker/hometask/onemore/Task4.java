package lesson_15_d_08_12_poker.hometask.onemore;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        //Make Matrix
        int arraySize = 4;
        int[][] myArray = new int[arraySize][arraySize];
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                myArray[i][j] = arraySize * i + j;
            }
        }
        System.out.println(Arrays.toString(myArray));

        // print Matrix
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                System.out.print(" |" + myArray[i][j] + " |");
            }
            System.out.println();
        }

        System.out.println("________________________________");

        //Transponation
        for (int i = 0; i <arraySize ; i++) {
            for (int j = i+1; j <arraySize ; j++) {
                int temp = myArray[i][j];
                myArray[i][j] = myArray[j][i];
                myArray[j][i]= temp;
            }
        }

        // Print transponation matrix
        for (int i = 0; i <arraySize ; i++) {
            for (int j = 0; j <arraySize ; j++) {
                System.out.print(" |" + myArray[i][j] + " |");
            }System.out.println();
        }




        }

    }

