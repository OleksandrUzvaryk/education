package lesson07loop_d_20_11.hometask.hometask2quater;

import java.util.Random;

public class QuaterDemo {

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(-10,10);
        int y = random.nextInt(-10, 10);
        System.out.println("X : " + x);
        System.out.println("Y : " + y);
        Quater quater = new Quater();
        quater.findQuater(x,y);
    }
}
