package consulttations.c30112023;

import java.util.Random;

public class Cart {

    public int[] fillArrayByRandom(int[] workingArray, int rangemin, int rangemax) {
        Random random = new Random();

        for (int i = 0; i < workingArray.length; i++) {
            workingArray[i] = random.nextInt(rangemin,rangemax);
        }
        return workingArray;
    }
}


