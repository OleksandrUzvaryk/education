package lesson05methstring_d_15_11.hometask.hometask;

import java.util.Scanner;

public class Task2Scaner {

    public static void main(String[] args) {
        Scanner inputWord = new Scanner(System.in);

        System.out.println("Input first word : ");
        String word1 = inputWord.nextLine();
        System.out.println("Length of 1 word :");
        System.out.println(word1.length());

        System.out.println("Input second word : ");
        String word2 = inputWord.nextLine();
        System.out.println("Length of 2 word :");
        System.out.println(word2.length());



        String substringword1 = word1.substring(0,4);
        String substringword2 = word2.substring(5,9);



        String mixWord = substringword1 + substringword2;


        System.out.println("Here mixed word :");
        System.out.println(mixWord);
        System.out.println("Length of mixed word :");
        System.out.println(mixWord.length());

    }
}
