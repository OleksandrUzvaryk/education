package lesson08arrays_d_22_11.hometask.onemore.task4;

public class Task4 {

    public int findMax (int [] array){
        int max = array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i]> max){
                max = array[i];
            }
        }return max;
    }

    public int findMin (int [] array){
        int min = array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }return min;
    }

    public int diferenceMaxMin(int max, int min){
        return max-min;
    }
}
