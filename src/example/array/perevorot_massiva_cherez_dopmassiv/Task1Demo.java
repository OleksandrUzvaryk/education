package example.array.perevorot_massiva_cherez_dopmassiv;

import java.util.Arrays;

public class Task1Demo {

    public static void main(String[] args) {

        int [] workingArray = {15,2,367,4};

        Task1ArrayRollOwer rollOwer = new Task1ArrayRollOwer();
        System.out.println(Arrays.toString(rollOwer.reverseArray(workingArray)));
    }
}
