package lesson08arrays_d_22_11.hometask.onemore.task5;

public class Task5 {

    public int averageValue (int [] array){
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum = sum + array[i];
        }return sum/array.length;
    }

}
