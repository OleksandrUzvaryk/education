package lesson_18_abstraction_d_15_12.code.lessoncode.oop.abstraction2.animals;

public class HouseAnimalVersion2 {


    public static void main(String[] args) {

        Dog dog1 = new Dog("Barbos","Volk");
        Dog dog2 = new Dog("Palkan", "Tigr");

        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Murzik");

        Parrot parrot1 = new Parrot("Kesha");
        Animal[] animals = {cat1, cat2, dog1, dog2, parrot1};



        for (int i = 0; i < animals.length; i++) {

            System.out.println(animals[i].getName());
            animals[i].voice();

        }

    }


}
