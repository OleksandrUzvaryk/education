package consultations.cons_03_07_12_lotto_game.lotto.service;

import java.util.Scanner;

public class UserInput {

    public String uiText(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();

    }

    public int uiInt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();

    }
}
