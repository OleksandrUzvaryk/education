package lesson06Ifelse_d_17_11.hometask.task4;
public class Lift {

    public int numberOfLifts(int floor, int stepUp, int stepDown){

        int numberIter = floor/(stepUp-stepDown);
        numberIter++;
        return numberIter;
    }

}
