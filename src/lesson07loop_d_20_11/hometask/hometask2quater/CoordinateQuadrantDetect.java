package lesson07loop_d_20_11.hometask.hometask2quater;

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
