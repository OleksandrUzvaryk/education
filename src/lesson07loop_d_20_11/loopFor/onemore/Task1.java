package lesson07loop_d_20_11.loopFor.onemore;

import java.util.Random;

public class Task1 {


    public static void main(String[] args) {

        // нужно получить в дипазоне разные числа для четных 0-100 и нечетных 100-900

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            if (i % 2 == 0) {
                System.out.println(random.nextInt(100));
            } else {
                System.out.println(100 + random.nextInt(900));
            }

        }

    }
}
