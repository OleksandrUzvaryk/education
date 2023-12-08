package extratasks.addhomework3.task14;

import java.util.Scanner;

 class Calculator {

     int userInput (){
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }

     public int  compareTwoNumber(int number1, int number2) {
        if (number1 > number2) {return number1;}
        else if (number1 < number2) {return number2;}
        else if (number1 == number2) {return number2;}
        else {return number1;}
    }
}
