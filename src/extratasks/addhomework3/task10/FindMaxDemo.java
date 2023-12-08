package extratasks.addhomework3.task10;

public class FindMaxDemo {
    public static void main(String[] args) {

        FindMax findMax = new FindMax();

        System.out.println("Please enter first number: ");
        int number1 = findMax.userInput();

        System.out.println("Please enter second number: ");
        int number2 = findMax.userInput();

        System.out.println("Please enter third number: ");
        int number3 = findMax.userInput();

        findMax.findMax(number1, number2, number3);

    }
}
