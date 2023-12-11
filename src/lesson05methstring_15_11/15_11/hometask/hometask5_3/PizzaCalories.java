package lesson05methstring_15_11.hometask.hometask5_3;

public class PizzaCalories {

    public double caloriesPizza (double diameter, double caloriesInOneCm){


        double squarePizza = Math.PI * (diameter / 2) * (diameter / 2);
        //System.out.println("В пицце " + diameter + " см площадь равна " + squarePizza + " см");

        double totalCalories = caloriesInOneCm * squarePizza;
        //System.out.println("В пицце " + diameter + " см " + totalCalories + " калорий");
        return totalCalories;
    }

}
