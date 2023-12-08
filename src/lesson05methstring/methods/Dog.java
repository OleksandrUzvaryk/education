package lesson05methstring.methods;

public class Dog {

    String name;
    String breed;

    public Dog (String name, String breed){
    this.name = name;
    this.breed = breed;
    }

    public void hello(){
        System.out.println("Say Hello");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}








