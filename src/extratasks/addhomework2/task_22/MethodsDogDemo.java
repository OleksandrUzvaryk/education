package extratasks.addhomework2.task_22;

public class MethodsDogDemo {
    public static void main(String[] args) {
        MethodsDog myDog = new MethodsDog("Shmell", 5, "black");
        //String myDogName = dog.name;
        //System.out.println("My name is  " + myDogName + ".");
        myDog.voice();
        myDog.changeColor("red");
        myDog.voice();
        myDog.changeColor("blue");
        myDog.voice();
    }
}
