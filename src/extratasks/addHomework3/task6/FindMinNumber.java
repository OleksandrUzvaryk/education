package extratasks.addHomework3.task6;

import java.util.Scanner;

public class FindMinNumber {

    public int userInput() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }
    public void findMin(int myFirstNumber,int mySecondNumber)
    {if(myFirstNumber < mySecondNumber) {System.out.println("Min is number 1 - " + myFirstNumber);
    } else if(myFirstNumber > mySecondNumber) {System.out.println("Min is number 2 - " + mySecondNumber);
    } else {System.out.println("The same number");}

    }
}
