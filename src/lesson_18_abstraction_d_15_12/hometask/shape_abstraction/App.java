package lesson_18_abstraction_d_15_12.hometask.shape_abstraction;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Service service = new Service();

        Shape [] myArray = service.makeArrayRandomSize(10,20);
        System.out.println("My empty random array => " + Arrays.toString(myArray)+ " has length - " + myArray.length);

        service.fillArrayShapePart(myArray);
        System.out.println("My full random array => " +Arrays.toString(myArray));

        service.printArray(myArray);



    }
}
