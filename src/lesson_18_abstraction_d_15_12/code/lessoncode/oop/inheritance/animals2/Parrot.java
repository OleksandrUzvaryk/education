package lesson_18_abstraction_d_15_12.code.lessoncode.oop.inheritance.animals2;

public class Parrot extends Animal {


    public Parrot(String name) {
        super(name);

    }

    @Override
    public void  voice(){
        System.out.println("Kesha!!!");
    }
}
