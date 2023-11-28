package extratasks.addHomework3.task7;

public class CompareNumberDemo {
    public static void main(String[] args) {
        CompareNumber compareNumber = new CompareNumber();

        System.out.println("Put first number: ");
        int number1 = compareNumber.userInput();

        System.out.println("Put second number: ");
        int number2 = compareNumber.userInput();

        compareNumber.makeCompare(number1, number2);

    }
}
