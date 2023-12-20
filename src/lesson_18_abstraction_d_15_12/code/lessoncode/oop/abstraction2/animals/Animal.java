package lesson_18_abstraction_d_15_12.code.lessoncode.oop.abstraction2.animals;

abstract class Animal {
    private String name;


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    abstract void voice();
}
