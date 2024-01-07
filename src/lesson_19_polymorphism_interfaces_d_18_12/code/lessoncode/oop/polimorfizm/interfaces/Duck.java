package lesson_19_polymorphism_interfaces_d_18_12.code.lessoncode.oop.polimorfizm.interfaces;

public class Duck implements Swimmable, Flying{

    @Override
    public void fly() {
        System.out.println("Утка летит низко над водой");
    }

    @Override
    public void swim() {
        System.out.println("Утка, плыви!");
    }
}
