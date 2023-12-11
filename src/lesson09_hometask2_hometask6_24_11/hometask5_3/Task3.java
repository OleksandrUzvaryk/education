package lesson09_hometask2_hometask6_24_11.hometask5_3;

public class Task3 {

    //Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром 24 см
    // вы купите пиццу диаметром 28 см.
    // Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.

    public static void main(String[] args) {

        PizzaCalories pizzaCalories = new PizzaCalories();

        double caloriesPizza24 = pizzaCalories.caloriesPizza(24, 40);
        double caloriesPizza28 = pizzaCalories.caloriesPizza(28, 40);

        System.out.println("Разница в калориях пиццы 28 и 24 см составит: " + (caloriesPizza28 - caloriesPizza24) + "cal");

        double caloriesPizza33 = pizzaCalories.caloriesPizza(33, 40);
        double caloriesPizza34 = pizzaCalories.caloriesPizza(34, 40);

        System.out.println("Разница в калориях пиццы 34 и 33 см составит: " + (caloriesPizza34 - caloriesPizza33) + "cal");
    }

}
