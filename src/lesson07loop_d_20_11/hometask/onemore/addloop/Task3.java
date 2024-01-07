package lesson07loop_d_20_11.hometask.onemore.addloop;

import java.util.Scanner;

public class Task3 {

    public void checkWord () {
        int counter = 0;
        String word = "";
        Scanner scanner = new Scanner(System.in);
        while (!word.equals("Hello")){System.out.println("Please enter greatings one more!");
            word = scanner.nextLine();
            counter++;
        }
        System.out.println("Your greatings is - " + word + " your tries - " + counter);

    }
}


