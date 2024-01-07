package lesson05methstring_d_15_11.hometask.oneMore.task4;

import java.util.Scanner;

public class Name {

    public String putName (String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        return result;
    }


}
