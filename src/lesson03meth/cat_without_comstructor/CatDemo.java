package lesson03meth.cat_without_comstructor;

public class CatDemo {
    public static void main(String[] args) {
Cat myCat = new Cat();
myCat.name = "Murzik";
myCat.breed = "Brit";
myCat.age = 3;

myCat.meow();
System.out.println("Возраст нашей кошки - " + myCat.age);
myCat.happyBirthday();
System.out.println("Возраст нашей кошки - " + myCat.age);

    }
}
