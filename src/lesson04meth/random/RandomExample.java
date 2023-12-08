package lesson04meth.random;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        System.out.println(Math.random());
        double random1 = Math.random()*100;

        Random random = new Random();
        System.out.println(random.nextInt(100));
        System.out.println(random.nextDouble(1000.0));

        // умножая на 100 мы получаем число в диапазоне 0 -9.999999999999999
        /*
        псевдослучайное число от минимум к максимум
        min + lesson04.random * (max -min+1)
        10 to 50 - включительно
        10 + lesson04.random (0.9999-min+1)*(50-10)
         */
        double random2 = Math.random()*(50 - 10 + 1) + 10;
        double random3 = Math.random()*(100 - 0 + 1) + 0;
        double random4 = Math.random()*(150 - 120 + 1) + 120;
        double random5 = Math.random()*(1000000 - 150000 + 1) + 150000;

        System.out.println("1st lesson04.random " + Math.round(random1));
        System.out.println("2st lesson04.random " + Math.round(random2));
        System.out.println("3st lesson04.random " + Math.round(random3));
        System.out.println("4st lesson04.random " + Math.round(random4));
        System.out.println("5st lesson04.random " + Math.round(random5));

    }
}
