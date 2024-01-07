package example.inheritance.animal;

public class App {
    public static void main(String[] args) {

        Dog dog = new Dog("Jack", "deutsch");
        Cat cat = new Cat("Barsik", 12);
        Parrot parrot = new Parrot("Kesha");

        dog.securityMode();
        cat.greatings();

        Animal [] myAnimals = {dog, cat, parrot};

        for (int i = 0; i < myAnimals.length ; i++) {
            System.out.println(myAnimals[i].getName());
          myAnimals[i].voice();
        }



    }
}
