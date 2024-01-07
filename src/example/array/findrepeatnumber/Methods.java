package example.array.findrepeatnumber;

public class Methods {

    public int findCountRepeatNumber(int[] array, int findNumber) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == findNumber) {
                counter++;
            }
        }
        return counter;
    }


}
