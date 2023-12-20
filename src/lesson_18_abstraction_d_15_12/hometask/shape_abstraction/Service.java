package lesson_18_abstraction_d_15_12.hometask.shape_abstraction;

import java.util.Random;

public class Service {


public Shape [] makeArrayRandomSize(){

    Random random = new Random();
    int arraySize = random.nextInt(5,25);
    Shape [] workA = new Shape[arraySize];
    return workA;
    }


    public long[] fillArray(Shape [] workA){
    Random random = new Random();

   // Circle circle = new Circle("Circle", Math.random()*10);
    int arraySize1 = random.nextInt(5,25);
    Circle [] myCArray = new Circle[arraySize1];

    //Rectangle rectangle = new Rectangle("Rectangle", Math.random()*10, Math.random()*10);
    int arraySize2 = random.nextInt(5,25);
    Rectangle [] myRArray = new Rectangle[arraySize2];


        int con = 0;

        for (int i = 0; i < myCArray.length; i++) {
            workA[i] = new Circle("Circle", Math.random()*10);
            myCArray[i] = new Circle();
        }

        for (int i = 0; i < myRArray.length; i++) {
            workA[i] = new Rectangle("Rectangle", Math.random()*10, Math.random()*10);
        }

        return ;
    }





}
