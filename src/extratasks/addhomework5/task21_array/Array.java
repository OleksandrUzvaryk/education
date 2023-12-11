package extratasks.addhomework5.task21_array;

import java.util.Random;

public class Array {
public int [][] returnArray(int [][] workArray) {
    Random random = new Random();
    for (int i = 0; i < workArray.length; i++) {// і будет прокручивать диапазон 0-2
        for (int j = 0; j < workArray[i].length; j++) {  // j будет прокручивать диапазоны 1-4, 5-6, 7-12
            workArray[i][j] = random.nextInt(100);
            //System.out.println(Arrays.toString(workArray));
        }
    }
    return workArray;
    }

    @Override
    public String toString() {
        return "Array{}";
    }
}