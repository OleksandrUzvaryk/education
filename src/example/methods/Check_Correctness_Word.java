package example.methods;

import java.util.Scanner;

public class Check_Correctness_Word {

    public void checkWord(){
        Scanner scanner = new Scanner(System.in);
        String word = "";
        int iteration = 0;

        while (!word.equals("hello")) {
            System.out.println("Введите слово 'hello': ");
            word = scanner.nextLine();
            iteration++;
        }

        System.out.println("Вы справились! Количество попыток: " + iteration);
    }

}
