package example.array.fillarray;

import java.util.Arrays;
import java.util.Random;

public class FillArrayRandom {

    public static void main(String[] args) {

        Random random = new Random();

        int arraySize = random.nextInt(15);

        int [] myA = new int[arraySize];
        for (int i = 0; i < myA.length ; i++) {
            myA[i]= random.nextInt(157);
        }
        System.out.println(Arrays.toString(myA));

    }

}
