package lesson_15_d_08_12_poker.hometask.onemore;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {

       Task7Methods service = new Task7Methods();

        double [] array1 = service.createArray(8,-15,99);
        System.out.println(Arrays.toString(array1));

        double [] array2 = service.createArray(8,-15,99);
        System.out.println(Arrays.toString(array2));

        double averageArray1 = service.makeAverageSumElements(array1);
        System.out.println("Average first array - " + averageArray1);

        double averageArray2 = service.makeAverageSumElements(array2);
        System.out.println("Average second  array - " + averageArray2);

        service.compareResult(averageArray1,averageArray2);


    }

}
