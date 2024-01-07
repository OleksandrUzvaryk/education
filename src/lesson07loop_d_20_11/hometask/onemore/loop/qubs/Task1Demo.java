package lesson07loop_d_20_11.hometask.onemore.loop.qubs;

import java.util.Random;

public class Task1Demo {

    public static void main(String[] args) {

      /*  Цель: Используя цикл for/while, написать программу, выводящую кубы чисел от 1 до n.
        Пример: Для числа n = 3, результат должен быть:
        1 в кубе = 1
        2 в кубе = 8
        3 в кубе = 27*/

        Random random = new Random();
        int startRange = 1;
        int endRange = random.nextInt(10);
        System.out.println(endRange);

        for (int i = startRange; i <= endRange; i++) {
            int result = (int) Math.pow(i,3);
            System.out.println(i + " Our result - " + result);
        }






    }
}
