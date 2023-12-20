package lesson_11_search_and_sort_d_29_11.hometask.bubble_sort;


import java.util.Arrays;

public class BubbleMethod {

    public static void bubbleSort(int[] workingArray){
        for (int i = 0; i < workingArray.length - 1; i++) {
            for(int j = 0; j < workingArray.length - i - 1; j++) {
                if(workingArray[j + 1] < workingArray[j]) {
                    int temporary = workingArray[j];
                    workingArray[j] = workingArray[j + 1];
                    workingArray[j + 1] = temporary;
                    System.out.println(Arrays.toString(workingArray));
                }
            }
        }
    }

}
