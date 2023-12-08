package extratasks.addhomework3.task15;

import java.util.Scanner;

 class Calculator {

     int userInput (){
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }

     public int  compareTwoNumber(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {return number1;}
        else if (number2 > number1 && number2 > number3) {return number2;}
        else if (number3 > number1 && number3 > number2) {return number3;}
        else if (number1 == number2 && number1 > number3){return number1;}
        else if (number1 == number3 && number1 > number2) {return number1;}
        else if (number2 == number3 && number2 > number1) {return number2;}
        else if (number1 == number2 && number1 == number3){return number1;}
        return 1;
     }
}
