package example.interfaces.animal;

public class Duck implements Fly,Swimm {
    @Override
    public void fly() {
        System.out.println("Duck fly!");
    }

    @Override
    public void swimm() {
        System.out.println("Duck swimm!");
    }
}
