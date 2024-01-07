package lesson06Ifelse_d_17_11.practice.practice_onemore;

import java.util.Scanner;

public class UserInput {

    public String uiString (String message){
        System.out.println(message);
        Scanner scanner= new Scanner(System.in);
        String result = scanner.nextLine();
        return result;
    }

    public int uiInt (String message){
        System.out.println(message);
        Scanner scanner= new Scanner(System.in);
       int result = scanner.nextInt();
        return result;
    }
}
