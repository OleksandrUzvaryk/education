package example.inheritance.animal;

public class Parrot extends Animal {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Parrot voice");
    }
}
