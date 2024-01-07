package example.search;

public class BinarySearch {


    public int binarySearch (int [] array, int serchNumber){

        int leftSide = 0;
        int rightSide = array.length - 1;

        while (leftSide <= rightSide){
            int midleIndex = (leftSide + rightSide)/2;
            int numberInThisMoment = array[midleIndex];
            if (numberInThisMoment == serchNumber){
                return midleIndex;
            }
            if (numberInThisMoment < serchNumber){
                leftSide = midleIndex +1;
            }
            if (numberInThisMoment > serchNumber){
                rightSide = midleIndex -1;
            }
        }return -1;

    }
}
