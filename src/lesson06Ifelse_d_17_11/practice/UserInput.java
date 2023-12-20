package lesson06Ifelse_d_17_11.practice;

import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);
    public int userInputInt() {
    int input = scanner.nextInt();
    return input;
    }

    public double userInputDouble() {
        double input = scanner.nextDouble();
        return input;
    }

    public String userInputString() {
        String input = scanner.nextLine();
        return input;
    }








}