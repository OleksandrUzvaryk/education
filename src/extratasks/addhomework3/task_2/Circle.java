package extratasks.addhomework3.task_2;

import java.util.Scanner;

public class Circle {

    public int userInput (String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    public double calculateArea(double radius){
        double degree = radius * radius;
        double square = Math.PI * degree;
        return square;
    }
    public void printResult (int resultD){
        String result = String.valueOf(resultD);
        System.out.println(" Square of your circle are: " + result + " sm");
    }




}
