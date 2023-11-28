package lesson08Arrays.hometask.task1;

public class Task1ArrayRollOver {

    public int [] rollOver (int [] myArray){

        myArray[0] = myArray[3]; // 4
        myArray[1] = myArray[2]; // 3
        myArray[2] = myArray[1];  // 2
        myArray[3] = myArray[0];  // 1

        return myArray;

    }
}
