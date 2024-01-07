package consultations.cons_05_book_kase_d_21_12.bookCase.service.utils;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public int userInputInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }

    public String userInputText(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

}
