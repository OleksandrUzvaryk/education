package lesson_11SearchandSort.hometask;



public class BubbleMethod {

    public static void bubbleSort(int[] workingArray){
        for (int i = 0; i < workingArray.length - 1; i++) {
            for(int j = 0; j < workingArray.length - i - 1; j++) {
                if(workingArray[j + 1] < workingArray[j]) {
                    int temporary = workingArray[j];
                    workingArray[j] = workingArray[j + 1];
                    workingArray[j + 1] = temporary;
                }
            }
        }
    }

}
