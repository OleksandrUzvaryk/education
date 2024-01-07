package lesson08arrays_d_22_11.hometask.onemore.task2;

public class Task2 {

    public boolean checkElements (int [] array){

        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] == array[j]) {return false;}
            }
        }return true;
    }

}
