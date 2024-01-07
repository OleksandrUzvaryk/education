package lesson05methstring_d_15_11;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat);
        cat.name = "Barsik";
        cat.breed = "Brit";

        System.out.println(cat);

        cat.greetings("Привет кошка!");
    }
}
