package extratasks.addhomework3.task5;

import java.util.Scanner;

public class FindMaxNumber {


    public int userInput() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }
    public void findMaximum(int myFirstNumber,int mySecondNumber)
    {if(myFirstNumber >mySecondNumber) {System.out.println("Max is number 1 - " + myFirstNumber);
    } else if(myFirstNumber<mySecondNumber) {System.out.println("Max is number 2 - " + mySecondNumber);
    } else {System.out.println("The same number");}

    }
    /*public void findMaximum2(int myFirstNumber,int mySecondNumber){

        if (myFirstNumber > mySecondNumber || myFirstNumber < mySecondNumber){
            int result = Math.max(myFirstNumber,mySecondNumber);
            System.out.println(result); }
        else {System.out.println("They the same!!!");}*/

}



