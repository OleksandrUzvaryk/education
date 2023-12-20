package example.array.find_reccuring_element;

import java.util.Arrays;

public class Task3Demo {

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 1, 2, 1, 2, 1, 2, 3, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1};

        Task3 service = new Task3();

        int[] result = service.arrayFindTheSame(myArray);
        System.out.println(Arrays.toString(result));


    }
}
