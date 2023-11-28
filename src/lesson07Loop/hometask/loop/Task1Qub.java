package lesson07Loop.hometask.loop;

import java.util.Random;

public class Task1Qub {
    public static void main(String[] args) {
        Random random = new Random();

        int startRange = 1;
        int endRange = random.nextInt(10);
        System.out.println("Start of range : " + startRange);
        System.out.println("End of range : " + endRange);

        for (int i = startRange; i <= endRange; i++) {
            int qub = (int) Math.pow(i, 3);
            System.out.println("Result :");
            System.out.println(qub);
        }

    }
}



