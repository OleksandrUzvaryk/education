package lesson08arrays_d_22_11.tasks.onemore;

import java.util.Random;

public class ArrayOperation {

    public int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public int[] fillArrayByRandom(int[] myArray, int range) {

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(range);
        }
        return myArray;
    }

    public int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public ArrayResult findMaxElementFindIndex(int[] array) {
        int max = array[0];
        ArrayResult result = new ArrayResult(array[0], 0);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result.getMaxElement()) {
                result.setMaxElement(array[i]);
                result.setIndexMaxElement(i);
            }
        }
        return result;
    }

    public int[] makeIndexMaxArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                counter++;
            }
        }


        int indexCounter = 0;
        int[] indexArray = new int[counter];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                indexArray[indexCounter] = i;
                indexCounter++;
            }
        }
        return indexArray;


    }

}










