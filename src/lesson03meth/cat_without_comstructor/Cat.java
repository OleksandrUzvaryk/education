package lesson03meth.cat_without_comstructor;

public class Cat {

    String name;
    int age;
    String breed;

    public void meow(){
        System.out.println("Meow!");
        System.out.println("Cat name: " + name);
        System.out.println("Cat breed: " + breed);
    }
    public void happyBirthday(){
        System.out.println("У нашей кошки день рождения!");
        System.out.println("Ей было " + age);
        age = age + 1;
        //age++;
        System.out.println("А теперь ей " + age);

    }

}
