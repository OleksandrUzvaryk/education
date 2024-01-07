package lesson_15_d_08_12_poker.hometask.onemore;

import java.util.Random;

public class Task7Methods {

    public double [] createArray(int sizeArray, int startRange, int endRange ){
        Random random = new Random();
        double [] array = new double[sizeArray];

        for (int i = 0; i < array.length-1 ; i++) {
            array[i] = random.nextDouble(startRange,endRange);}
        return array;
    }

    public double makeAverageSumElements (double [] array){
        double sum = 0;
        for (int i = 0; i <array.length-1 ; i++) {
            sum = sum + array[i];
        }return sum/ array.length-1;
    }


    public void compareResult (double average1, double average2){
        if (average1> average2){
            System.out.println("1 is bigger");
        }else if (average1< average2){System.out.println("2 is bigger");}
    else {
            System.out.println("Same !");
        }
    }


}
