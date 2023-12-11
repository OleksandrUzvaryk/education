package lesson07loop_20_11.hometask.add_loop;

import java.util.Random;

public class Task1Demo {
    // Распечатать все числа от 1 до 100, делящиеся на 5 без остатка. Использовать цикл do-while.
    public static void main(String[] args) {
        Task1DivFive number = new Task1DivFive();
        Random random = new Random();
        int myNumber = random.nextInt(0,100);
        number.divByFive(myNumber);
    }
}
