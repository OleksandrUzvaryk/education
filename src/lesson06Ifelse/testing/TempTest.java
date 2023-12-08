package lesson06Ifelse.testing;

public class TempTest {
    public static void main(String[] args) {
        TempConverter tempConverter = new TempConverter();


        double tempSource = 100;
        double expectedResult = 212;
        double actualResult = tempConverter.converterFromCelsiumToFahrenheit(100);

        if (expectedResult == actualResult) {
            System.out.println("Test #1 passed!");
        } else {
            System.out.println("Test #1 Failed!!!!");
            System.out.println("Expected result " + expectedResult + " , but recieved " + actualResult);
        }
        }
    }
