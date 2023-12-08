package extratasks.addhomework3.task9;

public class IncreasingDecreasingDemo {

    public static void main(String[] args) {

        IncreasingDecreasing increasingDecreasing = new IncreasingDecreasing();

        System.out.println("Please enter first number: ");
        int number1 = increasingDecreasing.userInput();

        System.out.println("Please enter second number: ");
        int number2 = increasingDecreasing.userInput();

        System.out.println("Please enter third number: ");
        int number3 = increasingDecreasing.userInput();

        increasingDecreasing.findDirection(number1,number2,number3);



    }




}
