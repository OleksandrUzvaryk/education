package lesson_17_incapsulation_inheritance_d_13_12.code.lessoncode.oop.inheritance.onemore.dog;

public class SmallDog extends Dog{
    private String name;

    public SmallDog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public void voice (){
        System.out.println("Small dog voice!");
    }


    public void eat(){
        System.out.println("I am eating now!!!");
    }

}
