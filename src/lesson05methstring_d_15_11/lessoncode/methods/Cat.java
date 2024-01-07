package lesson05methstring_d_15_11;

public class Cat {

    String name;
    String breed;

    public void greetings(String message){
        System.out.println(message);
        System.out.println("My name is " + name);
    }

    @Override
    public String toString() {
        return "methods.Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
