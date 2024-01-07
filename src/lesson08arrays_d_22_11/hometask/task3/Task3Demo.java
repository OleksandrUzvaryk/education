package lesson08arrays_d_22_11.hometask.task3;

import java.util.Arrays;

public class Task3Demo {

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 1, 2, 1, 2, 1, 2, 3, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1};

        Task3 service = new Task3();

        int[] result = service.arrayFindTheSame(myArray);
        System.out.println(Arrays.toString(result));

        int resultF = service.countRepeat(myArray,1);
        System.out.println(resultF);

    }
}
