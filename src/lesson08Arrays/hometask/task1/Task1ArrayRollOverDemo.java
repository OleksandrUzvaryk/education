package lesson08Arrays.hometask.task1;

import java.util.Arrays;

public class Task1ArrayRollOverDemo {
    public static void main(String[] args) {

        int [] myArray =  {1,2,3,4};

        Task1ArrayRollOver result = new Task1ArrayRollOver();

        System.out.println(Arrays.toString(result.rollOver(myArray)));


    }

}
