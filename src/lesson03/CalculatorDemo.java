package lesson03;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.x = 10;
        calc.y = 5;

        calc.printSum();

        Calculator calc2 = new Calculator();
        calc2.x = 50;
        calc2.y = 10;

        calc2.printSum();

    }


}
