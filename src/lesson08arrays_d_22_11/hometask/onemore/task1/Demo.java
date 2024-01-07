package lesson08arrays_d_22_11.hometask.onemore.task1;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        int [] array = {125,2,99983,14,199};
        Task1 service = new Task1();
        System.out.println(Arrays.toString(service.reverseArrayCreateArray(array)));
        System.out.println("_________________________________________");
        service.reverseArray(array);

    }


}
