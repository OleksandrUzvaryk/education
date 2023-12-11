package lesson10_hometask7_hometask8_27_11.hometask7_2;

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
