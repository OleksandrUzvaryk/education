package lesson05.hometask;

import java.util.Scanner;

public class Task3DemoPizza {
    public static void main(String[] args) {

        Task3Pizza pizza = new Task3Pizza();
        double resultDifferenceSizePizza = pizza.calorCalc(24,28);
        System.out.println("Количество лишних калорий составит : " + resultDifferenceSizePizza + " калорий!");

        Scanner calorDifference= new Scanner(System.in);
        System.out.println("Программа сравнения енергетической ценности пиц разных диаметров");
        System.out.println("Для сравнения введите размер в см 1 пиццы : ");
        int resultPizza1 = calorDifference.nextInt();
        System.out.println("Для сравнения введите размер в см 2 пиццы : ");
        int resultPizza2 = calorDifference.nextInt();
        double resultDifferenceSizePizza2 = pizza.calorCalc(resultPizza1,resultPizza2);
        System.out.println("Количество лишних калорий составит : ");
        System.out.println(resultDifferenceSizePizza2 + " калорий!");




    }
}
