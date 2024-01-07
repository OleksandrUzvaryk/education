package lesson_11_search_and_sort_d_29_11.hometask.binary_1_example;

import java.util.Arrays;

public class BinaryDemo {
    public static void main(String[] args) {

        int[] array = {112,224,3000,4457,51279,600345,700000,800000};
        int elementForSearch =-2214;
        Binary binary = new Binary();
        int result = binary.binarySearch(array,elementForSearch);
        System.out.println(result);


        }
}
