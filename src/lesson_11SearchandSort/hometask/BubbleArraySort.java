package lesson_11SearchandSort.hometask;


import java.util.Arrays;

public class BubbleArraySort {

    public static void main(String[] args) {

        int[] workingArray = {85,3,5,2,871,4,7,6};

        BubbleMethod bubbleMethod = new BubbleMethod();

        bubbleMethod.bubbleSort(workingArray);

        System.out.println("Array before sort: ");
        System.out.println(Arrays.toString(workingArray));

        bubbleMethod.bubbleSort(workingArray);
        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(workingArray));







    }


}
