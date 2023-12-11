package lesson06Ifelse_17_11.practice;

public class Task1 {
    public static void main(String[] args) {

        UserInput ui = new UserInput();
        System.out.println("Put even number : ");
        int userInput = ui.userInputInt();

        int range10 = 10;
        int range100 = 100;
        int range1000 = 1000;

        int diff10 = Math.abs(userInput - range10);
        int diff100 = Math.abs(userInput - range100);
        int diff1000 = Math.abs(userInput - range1000);

        /*if (diff10 < diff100) {
            System.out.println("Ближе к 10");
        } else if (diff100 < diff1000) {
            System.out.println("Ближе к 100");
        } else {
            System.out.println("Ближе к 1000");
        }
        System.out.println("=============================");
*/
        if (diff1000 < diff100) {
            System.out.println("Ближе к 1000");
        }
          else if (diff100 < diff10) {
            System.out.println("Ближе к 100");
        } else {
            System.out.println("Ближе к 10");
        }

    }
}
