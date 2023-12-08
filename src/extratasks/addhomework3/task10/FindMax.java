package extratasks.addhomework3.task10;

import java.util.Scanner;

public class FindMax {

    public int userInput (){
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }

    public void findMax (int number1, int number2, int number3){
        if ((number1 > number2) && (number1 > number3)){System.out.println("Max is first number: " + number1);}
        else if ((number2 > number1) && (number2 > number3)) {System.out.println("Max is second number: " + number2);}
        else if ((number3 > number1) && (number3 > number2)) {System.out.println("Max is third number: " + number3);}
        else {System.out.println("All number is the same");}
        }
    }
