package lesson05methstring_15_11.hometask;

public class Task3Pizza {

    String pizzaType;
    int diameterSize;

    public double calorCalc (int  diameterSize1, int  diameterSize2){
        int energyfrom1cmsquare = 40;
        int radius1 = diameterSize1/2;
        int radius2 = diameterSize2/2;
        double aArea = 3.14* radius1 * radius1;
        double bArea = 3.14 * radius2 * radius2;
        double result =(bArea - aArea) * energyfrom1cmsquare;
        return result;

    }
}
