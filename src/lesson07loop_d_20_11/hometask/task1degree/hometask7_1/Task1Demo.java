package lesson07loop_d_20_11.hometask.task1degree.hometask7_1;

import java.util.Arrays;

public class Task1Demo {
    public static void main(String[] args) {
        Task1 task1 = new Task1();

        System.out.println("Возведение числа 3 в степень 4: " + task1.pow(3,4) );

        System.out.println("Среднее арифметическое " + task1.average2(15.5));


       /* int[] aver = {1,2,3,4,5,6,7,8,9};
        System.out.println("Среднее арифметическое чисел " + Arrays.toString(aver) + " : " + task1.average(aver));*/
    }
}
