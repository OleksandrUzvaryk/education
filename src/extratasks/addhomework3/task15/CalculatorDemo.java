package extratasks.addhomework3.task15;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Put your number 1: ");
        int number1 = calculator.userInput();
        System.out.println("Put your number 2: ");
        int number2 = calculator.userInput();
        System.out.println("Put your number 3: ");
        int number3 = calculator.userInput();
        calculator.compareTwoNumber(number1,number2,number3);






    }
}
