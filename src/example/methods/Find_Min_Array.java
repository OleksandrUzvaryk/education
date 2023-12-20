package example.methods;

public class Find_Min_Array {
    public int minElement(int[] workingArray){
        int min = workingArray[0];
        for (int i = 1; i < workingArray.length; i++) {
            if (min >  workingArray[i]) {
                min = workingArray[i];
            }
        }
        return min;
    }
}
