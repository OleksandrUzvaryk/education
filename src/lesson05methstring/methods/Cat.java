package lesson05methstring.methods;

public class Cat {

    String name;
    String breed;

    public void greetings(String messsage){
        System.out.println(messsage);
        System.out.println("My name is " + name);
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}