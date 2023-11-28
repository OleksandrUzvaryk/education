package lesson06IfElse.hometask.task3;
import java.util.Random;
public class Clock {

    public static void main(String[] args) {

    Random myRan = new Random();
    int n = myRan.nextInt(28800);
    int b = n / 60 / 60;
        System.out.println("Seconds left " + n);
        switch (b){
        case 0:
            System.out.println("Less than 1 hour");
            break;
        case 1:
            System.out.println("To end of the day left " + b + " hour");
            break;
            case 2:
                System.out.println("To end of the day left " + b + " hour");
                break;

            case 3:
                System.out.println("To end of the day left " + b + " hour");
                break;
            case 4:
                System.out.println("To end of the day left " + b + " hour");
                break;
            case 5:
                System.out.println("To end of the day left " + b + " hour");
                break;

            case 6:
                System.out.println("To end of the day left " + b + " hour");
                break;

            case 7:
                System.out.println("To end of the day left " + b + " hour");
                break;

            case 8:
                System.out.println("To end of the day left " + b + " hour");
                break;
    }

    }
}