package extratasks.addHomework3.task14;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator ();

        int x1 = 64;
        int y1 = 5;

        int  expectResult1 =  x1;  // true
        int actualResult1 = calculator.compareTwoNumber(x1,y1);

        if (expectResult1 == actualResult1){System.out.println("Test-1 is passed, number 1 bigger than number 2!");}
        else {System.out.println("Test-1 test is failed!!!");}

        System.out.println("_______________________________");

        int x2 = 8;
        int y2 = 10;

        int  expectResult2 =  y2;
        int actualResult2 = calculator.compareTwoNumber(x2,y2);
        if (expectResult2 == actualResult2){System.out.println("Test-2 is passed, number 2 bigger than number 1!");}
        else {System.out.println("Test-2 is failed!!!");}


        System.out.println("_______________________________");

        int x3 = -10;
        int y3 = -10;
        int  expectResult3 =  (x3 + y3) / 2;
        int actualResult3 = calculator.compareTwoNumber(x3,y3);
        if (expectResult3 == actualResult3){System.out.println("Test-3 number 1 and number 2 the same!");}
        else {System.out.println("Test-3 is failed!!!");}


    }
}
