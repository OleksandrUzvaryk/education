package extratasks.addHomework3.task13;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        /*System.out.println("Put your number 1: ");
        int number1 = calculator.userInput();

        System.out.println("Put your number 2: ");
        int number2 = calculator.userInput();

        int resultSum = calculator.sum(number1,number2);
        int resultSub = calculator.sub(number1,number2);
        int resultMul = calculator.mul(number1,number2);
        double resultDiv = calculator.div(number1,number2);

        calculator.printMessage(resultSum,resultSub,resultMul,resultDiv);*/

        System.out.println("Find even number. Put your number here: ");
        boolean even = calculator.isEven(calculator.userInput());
        System.out.println("This number is even - " + even);


    }
}
