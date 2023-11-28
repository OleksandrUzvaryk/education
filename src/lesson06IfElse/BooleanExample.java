package lesson06IfElse;

public class BooleanExample {

    public static void main(String[] args) {

        boolean result = true; //или false

        int x = 10;
        int y =20;

        boolean resultCompare = (x>y);
        System.out.println(resultCompare);

        char letter1 = 'A';
        char letter2 = 'Z';

        System.out.println((int) letter1);
        System.out.println((int) letter2);


        boolean resultCompareChar = ( letter2> letter1);
        System.out.println(resultCompareChar);

        /*
            >
            <
            >=
            <=
            ==
            !=
         */

    }
}
