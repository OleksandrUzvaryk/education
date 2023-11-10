package lesson03.catWk;

public class Cat {

    String name;
    int age;
    String breed;

    public void meow (){
        System.out.println("Meow!");

    }

    public void happyBirthday (){
        System.out.println("У нашей кошки сегодня день рождения!");
        System.out.println("Ей было 2" + age);
        age = age + 1;

        // аналогично команде a++;
        System.out.println("А теперь ей " + age);

    }

}
