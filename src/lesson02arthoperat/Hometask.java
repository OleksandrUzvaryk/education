package lesson02arthoperat;
    public class Hometask {
        public static void main(String[] args) {

           /* // Задача №2

            byte age = 45;
            short numberOfChildren = 3;
            int losses = -8756;
            long followers = 1002145;
            float power = 15.878f;
            double energyLevel = 15.5;
            boolean respect = true;
            char firstLetter = 'M';

            System.out.println("Task2 'Primitive values':");
            System.out.println("age = " + age);
            System.out.println("numberOfChildren = " + numberOfChildren);
            System.out.println("losses = " +losses);
            System.out.println("followers = " + followers);
            System.out.println("power = " + power);
            System.out.println("energyLevel = " + energyLevel);
            System.out.println("respect = " + respect);
            System.out.println("firstLetter = " + firstLetter);


            // Задача №3-a

            double a = 27.0 % 11.0;
            double b = (499.0 + 1.0)/ 100.0;
            double c = 2.7 + 2.3;

            System.out.println("Task3 'All variables':");
            System.out.println("My number abc is :" + 555.0);
            System.out.println("variable a = " + a);
            System.out.println("variable b = " + b);
            System.out.println("variable c = " + c);*/

            // Задача №3-b

            int numberAbc = 555;
            int a2 = (numberAbc - 50) / 100;
            int b2 = numberAbc * 2 / 222;
            int c2 = (numberAbc / 5) - 106;

            System.out.println("Task3 'All variables':");
            System.out.println("My number a2b2c2 is :" + numberAbc);
            System.out.println("variable a2 = " + a2);
            System.out.println("variable b2 = " + b2);
            System.out.println("variable c2 = " +c2);

            String numberStr = String.valueOf(numberAbc); // приведение типов Инт в Чар
            System.out.println(numberStr);

            System.out.println(" Third number - " + numberStr.charAt(0));
            System.out.println(" Second number - " + numberStr.charAt(1));
            System.out.println(" First number - " + numberStr.charAt(2));

    }
}










