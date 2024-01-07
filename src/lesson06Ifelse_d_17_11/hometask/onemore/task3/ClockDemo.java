package lesson06Ifelse_d_17_11.hometask.onemore.task3;

import java.util.Random;

public class ClockDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Clock clock = new Clock();
        int actualTimeLeft = random.nextInt(28000);

        System.out.println("До конца рабочего дня осталось " + actualTimeLeft + " sec");
        System.out.println("До конца рабочего дня осталось " + clock.checkTime(actualTimeLeft));




    }


}
