package lesson_11.hometask;

import java.util.Arrays;

public class BinaryDemo {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8};
        int elementForSearch = 5;
        Binary binary = new Binary();
        System.out.println("Our number has index: " + Arrays.binarySearch(array,elementForSearch));



        }
}
