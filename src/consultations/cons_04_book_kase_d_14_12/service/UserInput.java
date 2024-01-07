package consultations.cons_04_book_kase_d_14_12.service;

import java.util.Scanner;

public class UserInput {

    public int userInterfaceInputInt(String message){
        System.out.println(message);
        Scanner scanner= new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }

    public String userInterfaceInputText(String message){
        System.out.println(message);
        Scanner scanner= new Scanner(System.in);
        String result = scanner.nextLine();
        return result;
    }









}
