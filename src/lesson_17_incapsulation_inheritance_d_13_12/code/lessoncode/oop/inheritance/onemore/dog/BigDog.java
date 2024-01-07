package lesson_17_incapsulation_inheritance_d_13_12.code.lessoncode.oop.inheritance.onemore.dog;

public class BigDog extends Dog {
    private String name;

    public BigDog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
