package example.scanner;

import java.util.Scanner;

public class UserInput {

    public String userWordInput (String message) { // метод по возврату введеного текста , String message
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String word = scanner.nextLine();
        return word;
    }

    public int userNumberInput (String message) { // метод по возврату введеного текста , String message
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
       int number = scanner.nextInt();
        return number;
    }


}
