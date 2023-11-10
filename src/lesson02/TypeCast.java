package lesson02;

public class TypeCast {

    public static void main(String[] args) {

        int x = 10;
        double xDouble = x;
        // равносильно
        double x2Double = (double) x;


        double yDouble = 10.9;
        int y = (int) yDouble;
        System.out.println(y);

        yDouble = 464467868678678678463.9;
        long  yLong = (long) yDouble;
        System.out.println(yLong);






    }
}
