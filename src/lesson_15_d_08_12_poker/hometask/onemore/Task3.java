package lesson_15_d_08_12_poker.hometask.onemore;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the word with gap!");
        String myWords = scanner.nextLine();

        int wordCounter = 0;
        if (myWords.length() != 0) {
            wordCounter++;

            for (int i = 0; i < myWords.length(); i++) {
                if (myWords.charAt(i) == ' ') {
                    wordCounter++;
                }
            }
        }
        System.out.println("Number " + wordCounter + " word");

    }
}