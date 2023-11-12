package lesson03.calculator2;

public class CalculatorNewModelDemo {

    public static void main(String[] args) {

        CalculatorNewModel calc = new CalculatorNewModel();
        int result = calc.sum(10,5);

        System.out.println("Сумма значений = " + result);

        result = calc.sub(30,41);

        System.out.println("Результат вычетания = " + result);

        result = calc.multipl(15,15);
        System.out.println("Результат умножения = " + result);

        double resultDiv = calc.div(113,5);
        System.out.println("Результат деления = " + resultDiv);

    }
}
