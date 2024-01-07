package example.inheritance.animal;

public class Cat extends Animal {

    private int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void greatings (){
        System.out.println("Hallo i am cat!");
    }

    @Override
    public void voice() {
        System.out.println("Cat voice");
    }
}
