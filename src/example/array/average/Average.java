package example.array.average;

public class Average {

    public int findAverage (int [] array){
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum = sum +array[i];
        }return sum/ array.length;
    }

}
