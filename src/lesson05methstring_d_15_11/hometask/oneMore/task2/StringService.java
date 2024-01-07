package lesson05methstring_d_15_11.hometask.oneMore.task2;

import java.util.Scanner;

public class StringService {

    public String userInput (String message){
        Scanner scanner= new Scanner(System.in);
        System.out.println(message);
        String result = scanner.nextLine();
        return result;
    }

}
