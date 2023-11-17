package lesson05.methods;

import lesson05.methods.Cat;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat);
        cat.name = "Barsik";
        cat.breed = "Brit";

        cat.greetings("Hello Cat!!!");



    }
}
