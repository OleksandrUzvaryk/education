package lesson05.methods;

import lesson05.methods.Dog;

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Polkan", "Dvorov");
        System.out.println(myDog);
        myDog.hello();

    }
}
