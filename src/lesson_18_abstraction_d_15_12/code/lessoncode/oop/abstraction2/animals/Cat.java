package lesson_18_abstraction_d_15_12.code.lessoncode.oop.abstraction2.animals;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    public void  greating(){
        System.out.println("Cat name " + getName());
    }
    @Override
    public void voice() {
        System.out.println("Meow!!!");
    }

}
