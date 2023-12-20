package lesson03meth_d_10_11.hometasks;

public class Task5DivDemo {

    public static void main(String[] args) {

        // реализация через метод с возвратом значений
        Task5div result2 = new Task5div();

        int result = result2.div2Result(10,2);
        System.out.println("1 вариант остатка от деления целого числа на 2 = " + result);
        result = result2.div2Result(198,2);
        System.out.println("2 вариант остатка от деления целого числа на 2 = " + result);
        result = result2.div2Result(11576,2);
        System.out.println("3 вариант остатка от деления целого числа на 2 = " + result);
        System.out.println("Вывод: деление целого числа на 2,  имеет 0 остаток!" );

        System.out.println("*********************************************************");

        result = result2.div3Result(117,3);
        System.out.println("1 вариант остатка от деления целого числа на 3 = " + result);
        result = result2.div3Result(118,3);
        System.out.println("2 вариант остатка от деления целого числа на 3 = " + result);
        result = result2.div3Result(119,3);
        System.out.println("3 вариант остатка от деления целого числа на 3 = " + result);
        result = result2.div3Result(120,3);
        System.out.println("4 вариант остатка от деления целого числа на 3 = " + result);
    }
}
