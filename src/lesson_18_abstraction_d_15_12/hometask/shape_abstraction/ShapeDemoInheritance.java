package lesson_18_abstraction_d_15_12.hometask.shape_abstraction;

import java.util.Arrays;
import java.util.Random;

public class ShapeDemoInheritance {

    public static void main(String[] args) {

        Service myService = new Service();

        Random random = new Random();
        int length = random.nextInt(20,32);
        Shape [] workA = new Shape[length];
        System.out.println(Arrays.toString(myService.makeArrayRandomSize()));
        System.out.println(Arrays.toString(myService.fillArray(workA)));
/*


        Circle circle = new Circle("Circle", 15);
        Rectangle rectangle = new Rectangle("Rectangle", 10, 20);
        Square square = new Square("Square", 2);
        Triangle triangle = new Triangle("Triangle",3,15,4,5);

        Shape[] shapes = {circle, rectangle, square, triangle};

        for (int i = 0; i <shapes.length ; i++) {
            System.out.println("Shape - " + shapes[i].getTitle());
            System.out.println("Area is - " + shapes[i].calculatorArea());
            System.out.println("Perimetr is - " + shapes[i].calculatorPerimetr());
        }

        double allAreas = 0;
        double allPerimetr= 0;

        for (int i = 0; i <shapes.length ; i++) {
            allAreas = allAreas + shapes[i].calculatorArea();
        }
        System.out.println("Сумма площадей всех фигур равна - " + allAreas);

        for (int i = 0; i <shapes.length ; i++) {
            allPerimetr = allPerimetr + shapes[i].calculatorPerimetr();
        }
        System.out.println("Сумма периметорв всех фигур равна - " + allPerimetr);


*/


    }
}