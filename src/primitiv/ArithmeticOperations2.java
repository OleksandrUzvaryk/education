package primitiv;

public class ArithmeticOperations2 {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;
        System.out.println(x/y);

         x = 10;
         y = 3;
        System.out.println(x/y);
        System.out.println(x%y);

        double xDouble = 10.0;
        System.out.println(xDouble/y);

       double doubleResult = (double) x / y;

        System.out.println(doubleResult);


    }

    public static class TypeCast {

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
}
