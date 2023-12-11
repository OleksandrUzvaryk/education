package lesson03meth_10_11.cat_with_constructor;


public class CatDemo {
    public static void main(String[] args) {
        Cat myCat = new Cat();

        Cat myCat2 = new Cat("Barsik");
        System.out.println(myCat2.name);

        Cat myCat3 = new Cat("Dexter", 3);
        System.out.println(myCat3.name);
        System.out.println(myCat3.age);

        Cat myCat4 = new Cat("Barsik", 3, "Brit");
        System.out.println(myCat4.name);
        System.out.println(myCat4.age);
        System.out.println(myCat4.breed);





    }
}
