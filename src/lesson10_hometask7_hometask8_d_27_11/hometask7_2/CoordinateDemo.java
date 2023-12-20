package lesson10_hometask7_hometask8_d_27_11.hometask7_2;

public class CoordinateDemo {
    public static void main(String[] args) {
        CoordinateQuadrantDetect detect = new CoordinateQuadrantDetect();

        int x = 56;
        int y = -55;

        int quadtant = detect.detect(x,y);

        if (quadtant == 0){
            System.out.println("Точка с координатами x = " + x + " и y = " + y + " находится на оси или в центре");
        } else {
            System.out.println("Точка с координатами x = " + x + " и y = " + y + " находится в " + quadtant + " квадрате");

        }
    }
}
