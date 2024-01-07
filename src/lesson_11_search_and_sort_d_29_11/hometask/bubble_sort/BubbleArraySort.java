package lesson_11_search_and_sort_d_29_11.hometask.bubble_sort;


import java.util.Arrays;

public class BubbleArraySort {

    public static void main(String[] args) {

        int[] workingArray =  {8,3,5,2,1,4,7,6};


        System.out.println("Array before sort: ");
        System.out.println(Arrays.toString(workingArray));

        BubbleMethod bubbleMethod = new BubbleMethod();
        /*System.out.println("In process: ");
        bubbleMethod.bubbleSort(workingArray);

        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(workingArray));*/


        bubbleMethod.bubbleSortOptimized(workingArray);

    }
}
