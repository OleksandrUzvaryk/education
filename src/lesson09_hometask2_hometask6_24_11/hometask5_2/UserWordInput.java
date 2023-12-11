package lesson09_hometask2_hometask6_24_11.hometask5_2;

import java.util.Scanner;

public class UserWordInput {

    public String userWordInput (String message){ // метод по возврату введеного текста , String message
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String word = scanner.nextLine();
        return word;
    }
}
