package lesson07loop.hometask.hometask2quater;

public class CoordinateQuadrantDetect {

    public int detect(int x, int y){
        if (x > 0 && y > 0){
            return 1;
        }
        if (x < 0 && y > 0){
            return 2;
        }
        if (x < 0 && y < 0){
            return 3;
        }
        if (x > 0 && y < 0){
            return 4;
        }

        return 0;
    }
}
