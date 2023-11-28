package extratasks.addHomework3.task9;

import java.util.Scanner;

public class IncreasingDecreasing {

    public int userInput (){
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }
    public void findDirection (int number1, int number2, int number3) {
        if ((number1 > number2) && (number2 > number3) ) {
            System.out.println("decreasing");
        }
       else if ((number1 < number2) && (number2 < number3)) {System.out.println("increasing");}
        else if ((number1 == number2) && (number2 == number3)) {System.out.println("one line");}
        else {System.out.println("Neither increasing or decreasing order");}
    }
}
