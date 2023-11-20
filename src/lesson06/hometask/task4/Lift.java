package lesson06.hometask.task4;

public class Lift {

    public int numberOfLifts(int floor, int stepUp, int stepDown){
        int s1 = floor - stepDown;
        int s2 = s1 + floor - stepDown;
        int s3 = s2 + floor - stepDown;
        int s4 = s3 + floor - stepDown;
        return s4;


    }



}
