package lesson06.hometask.task4;
public class Lift {

    public int numberOfLifts(int floor, int stepUp, int stepDown){

        int numberIter = floor/(stepUp-stepDown);
        numberIter++;
        return numberIter;
    }

}
