package lesson_18_abstraction_d_15_12.code.lessoncode.oop.inheritance.animals2;

public class Dog extends Animal {

private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void  voice(){
        System.out.println("Gav!!!");
    }

}
