package lesson_19_polymorphism_interfaces_d_18_12.code.lessoncode.oop.polimorfizm.music;

public class RockMusician implements Musician{


    @Override
    public void dance() {
        System.out.println("Dancing rock");
    }

    @Override
    public void sing() {
        System.out.println("Singing rock");
    }

    @Override
    public void greeting() {
        System.out.println("WoooooooooW!!");
    }
}
