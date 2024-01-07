package lesson_19_polymorphism_interfaces_d_18_12.code.lessoncode.oop.polimorfizm.music;

public class OperaSinger implements Singer{
    @Override
    public void sing() {
        System.out.println("Opera!");
    }
}
