package lesson_15_d_08_12_poker.hometask.task7;

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {
        int [] array1= new int[5];
        int [] array2 = new int[5];

        for (int i = 0; i < 5; i++) {
            array1[i] = (int)(Math.random()*6);
            array2[i] = (int)(Math.random()*6);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < 5; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
        }
        sum1/=5;
        sum2/=5;

        if(sum2> sum1){
            System.out.println("Среднее арифметическое первого массива ("+sum1+") больше среднего арифметического "+
                    "второго массива ("+sum2+")");
        } else if(sum1 < sum2){
            System.out.println("Среднее арифметическое первого массива ("+sum1+") меньше среднего арифметического "+
                    "второго массива ("+sum2+")");
        } else {
            System.out.println("Средние арифметические массивов равны ("+sum1+")");
        }
    }






}
