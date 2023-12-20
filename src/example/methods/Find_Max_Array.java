package example.methods;

public class Find_Max_Array {
    public int maxElement(int[] workingArray){
        int max = workingArray[0];
        for (int i = 1; i < workingArray.length; i++) {
            if (max < workingArray[i]) {
                max = workingArray[i];
            }
        }
        return max;
    }
}
