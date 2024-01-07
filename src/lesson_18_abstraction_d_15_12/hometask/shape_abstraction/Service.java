package lesson_18_abstraction_d_15_12.hometask.shape_abstraction;

import java.util.Arrays;
import java.util.Random;

public class Service {

    Shape[] myArray;


    public Shape[] makeArrayRandomSize(int startRange, int endRange) {
        Random random = new Random();
        int lang = random.nextInt(startRange, endRange);
        Shape[] workA = new Shape[lang];
        return workA;

    }

    public Shape[] fillArrayShapePart(Shape[] array) {

        Random random = new Random();
        int[] workA = new int[array.length];
        for (int i = 0; i < workA.length; i++) {
            workA[i] = random.nextInt(4);
            switch (workA[i]) {
                case 0:
                    array[i] = new Circle("Circle " + i + " ", random.nextDouble(5));
                    break;
                case 1:
                    array[i] = new Triangle("Triangle " + i + " ", random.nextDouble(5),
                            random.nextDouble(5), random.nextDouble(5), random.nextDouble(5));
                    break;
                case 2:
                    array[i] = new Rectangle("Rectangle " + i + " ", random.nextDouble(5),
                            random.nextDouble(5));
                    break;

                case 3:
                    array[i] = new Square("Square " + i + " ", random.nextDouble(5));
                    break;
            }

        }
        return array;
    }

    public Shape[] fillArrayShapeFull() {

        Random random = new Random();
        int size = random.nextInt(20);
        int[] workA = new int[size];
        Shape[] workB = new Shape[size];
        for (int i = 0; i < workA.length; i++) {
            workA[i] = random.nextInt(4);
            switch (workA[i]) {
                case 0:
                    workB[i] = new Circle("Circle " + i + " ", random.nextDouble(5));
                    break;
                case 1:
                    workB[i] = new Triangle("Triangle " + i + " ", random.nextDouble(5),
                            random.nextDouble(5), random.nextDouble(5), random.nextDouble(5));
                    break;
                case 2:
                    workB[i] = new Rectangle("Rectangle " + i + " ", random.nextDouble(5),
                            random.nextDouble(5));
                    break;

                case 3:
                    workB[i] = new Square("Square " + i + " ", random.nextDouble(5));
                    break;
            }

        }
        return workB;
    }

    public void printArray(Shape[] arrayForPrint) {

        System.out.println("Information about area and perimetr \n");
        int counter = 1;
        double allArea = 0;
        double allPerimetr = 0;
        for (int i = 0; i < arrayForPrint.length; i++) {
            allPerimetr = allPerimetr + arrayForPrint[i].calculatorPerimetr();
            allArea = allArea + arrayForPrint[i].calculatorArea();
            System.out.println(counter + arrayForPrint[i].getTitle() + "Area is " + arrayForPrint[i].calculatorArea());
            System.out.println(counter + arrayForPrint[i].getTitle() + "Perimetr is " + arrayForPrint[i].calculatorPerimetr());
            counter++;
        }
        System.out.println("\nSum of all area is " + allArea);
        System.out.println("\nSum of all perimetr is " + allPerimetr);

    }
}












