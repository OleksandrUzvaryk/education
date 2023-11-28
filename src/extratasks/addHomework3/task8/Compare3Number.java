package extratasks.addHomework3.task8;

import java.util.Scanner;

public class Compare3Number {

    public int userInput (){
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;}
    public void makeCompare3numbers(int number1, int number2, int number3){  // метод по сравнению чисел
        if (number1 == number2 && number1 == number3){ System.out.println("All numbers are equal");}
        else if ((number1 != number2) && (number1 != number3) && (number2 != number3)){System.out.println("All numbers are different");}
        else {System.out.println("Neither all are equal or different");}


    }
}
