package lesson02arthoperat_08_11.primitiv;

public class ArithmeticOperations {

    public static void main(String[] args) {

        System.out.println("2 + 2 =" +4);

       int x = 10;
       int y = 5;

        System.out.println(x/y);

         x = 25;
         y = 10;

         int result = x*y;

        System.out.println(result);
        double xDouble = 10.5;
        double yDouble = 5.5;

        double doableResult = xDouble + yDouble;

        double xDoubleTwo = x;



    }

    public static class NewPackageClass {

        public static void main(String[] args) {

            int a = 27 % 11;
            int b = (499 + 1)/ 100;
            double c = 2.7 + 2.3;

            System.out.println("Task3 'All variables':");
            System.out.println("My number abc is :" + a + b + c);

            System.out.println("a-" + a);
            System.out.println("b-" + b);
            System.out.println("c-" +c);

        }
    }
}
