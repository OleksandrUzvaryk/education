package lesson03.calculator1;

import lesson03.calculator1.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        // создадим новый обьект типа Calculator для того
        // что бы сохранить переменные и пользоваться ими
        Calculator calc = new Calculator();

        // сохраним значение в переменных х и у
        calc.x = 10;
        calc.y = 5;

        // вызовем у обьекта Calculator, ранее созданный метод  printSum
        calc.printsum();

        // создадим 2 калькулятор, он будет совершенно другим
        // и не имеет отношения к первому
        Calculator calc2 = new Calculator();

        calc2.x = 50;
        calc2.y = 10;

        calc2.printsum();



    }




}
