package extratasks.addhomework3.task8;

public class Compare3NumberDemo {

    public static void main(String[] args) {

        Compare3Number compare3Number = new Compare3Number();

        System.out.println("Please enter first number: ");
        int number1 = compare3Number.userInput();

        System.out.println("Please enter second number: ");
        int number2 = compare3Number.userInput();

        System.out.println("Please enter third number: ");
        int number3 = compare3Number.userInput();

        compare3Number.makeCompare3numbers(number1,number2,number3);

    }
}
