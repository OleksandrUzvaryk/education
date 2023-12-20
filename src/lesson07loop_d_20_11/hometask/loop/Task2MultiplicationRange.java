package lesson07loop_d_20_11.hometask.loop;

import java.util.Random;

public class Task2MultiplicationRange {

    public static void main(String[] args) {

        Random random = new Random();

        int startRange = 0;
        int endRange = random.nextInt(10);
        System.out.println("Start of range : " + startRange);
        System.out.println("End of range : " + endRange);

        for (int i = startRange; i <= endRange; i++) {

            int mult = i * (endRange);
            System.out.println("Result :");
            System.out.println(mult);

        }
    }
}
