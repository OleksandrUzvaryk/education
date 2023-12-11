package lesson08arrays_22_11.hometask.task5;

public class Task5 {

    public int sumOfArrayElements(int[] workingArray){
        int sum = 0;
        for (int i = 0; i < workingArray.length; i++) {
            sum = sum + workingArray[i];
        }
        return sum / workingArray.length;

    }


}
