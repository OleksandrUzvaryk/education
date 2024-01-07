package lesson08arrays_d_22_11.hometask.onemore.task2;

import lesson08arrays_d_22_11.hometask.onemore.task1.Task1;

public class Demo {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7};
        int [] array2 = {1,2,2,4,2,6,7};

        Task2 service = new Task2();

        boolean result1 = service.checkElements(array);
        System.out.println(result1);
        boolean result2 = service.checkElements(array2);
        System.out.println(result2);

    }
}
