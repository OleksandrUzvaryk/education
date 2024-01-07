package example.inheritance.animal;

public class Dog extends Animal {

    private String breed; // своя переменная

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void securityMode (){
        System.out.println("I on the work! GaF!");
    }
    @Override
    public void voice() {
        System.out.println("Dog voice");
    }
}
