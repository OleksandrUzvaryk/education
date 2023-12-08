package extratasks.addhomework3.task7;

import java.util.Scanner;

public class CompareNumber {

    public int userInput (){
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;}
    public void makeCompare(int number1, int number2){if (number1 == number2){System.out.println("Numbers are equals");}
        else {System.out.println("Numbers are different");}

    }
}
