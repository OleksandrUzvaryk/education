package lesson_18_abstraction_d_15_12.code.lessoncode.oop.abstraction2.animals;

public class Parrot extends Animal {


    public Parrot(String name) {
        super(name);

    }

    @Override
    public void  voice(){
        System.out.println("My parrot " + getName());
    }
}
