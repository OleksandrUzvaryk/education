package lesson07loop_d_20_11.hometask.task3cow;

import java.util.Scanner;

public class CowDemo {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the number: ");
        int symbol = scanner.nextInt();
        String sentence = cow.cowFraze(symbol);
        System.out.println(sentence);


    }
}
