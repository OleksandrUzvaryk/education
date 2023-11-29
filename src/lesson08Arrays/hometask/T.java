package lesson08Arrays.hometask;

import lesson08Arrays.hometask.task1.Task1ArrayRollOwer;

import java.util.Arrays;

public class T {

    public static void main(String[] args) {

        int [] workingArray = {1,2,3,4};

        Task1ArrayRollOwer rollOwer = new Task1ArrayRollOwer();
        System.out.println(Arrays.toString(rollOwer.reverseArray(workingArray)));




    }


}
