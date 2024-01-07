package example.inheritance.animal;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voice (){
        System.out.println("Animal voice");
    }

}
