package extratasks.addHomework3.task13;

import java.util.Scanner;

public class Calculator {

    public int userInput (){
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }

    public int sum(int x, int y){
        int result = x + y;
        return result;
    }
    public int sub(int x, int y){
        int result = x - y;
        return result;
    }
    public int mul(int x, int y){
        int result = x * y;
        return result;
    }
    public double div(int x, int y){
        double result = (double) x/y;
        return result;
    }

    public void printMessage(int resultSum, int resultSub, int resultMul, double resultDiv){
        System.out.println(" += " + resultSum + "\t -= " + resultSub + " \t *= " + resultMul + "\t /= " + resultDiv);
    }

    public boolean isEven(int number){
        if (number % 2 == 0){return true;}
        else {return false;}
    }

}
