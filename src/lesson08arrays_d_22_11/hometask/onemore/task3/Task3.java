package lesson08arrays_d_22_11.hometask.onemore.task3;

public class Task3 {

    public int findCountNumber(int[] array, int findNumber) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == findNumber) {
                counter++;
            }
        }
        return counter;
    }
}
