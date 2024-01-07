package lesson07loop_d_20_11.hometask.onemore.quater;

import lesson07loop_d_20_11.hometask.task1degree.hometask7_1.Task1;

import java.util.Random;

public class Task2Demo {

    public static void main(String[] args) {

        Task2 service = new Task2();
        Random random = new Random();
        int x = 5;
        int y = -5;

        System.out.println(service.findQuater(x,y));


    }
}
