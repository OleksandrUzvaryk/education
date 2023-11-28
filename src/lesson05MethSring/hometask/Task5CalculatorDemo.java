package lesson05MethSring.hometask;

public class Task5CalculatorDemo {

    public static void main(String[] args) {

        Task5Calculator myCalc = new Task5Calculator();

        int resultSum = myCalc.sum(45,479);
        System.out.println("Результат сложения: " + resultSum);

        int resultSub = myCalc.sub(4,4789);
        System.out.println("Результат вычитания : " + resultSub);

        int resultMul = myCalc.mul(78,124);
        System.out.println("Результат умножения : " + resultMul);

        double resultDiv = myCalc.div(789,238);
        System.out.println("Результат деления : " + resultDiv);


    }
}
