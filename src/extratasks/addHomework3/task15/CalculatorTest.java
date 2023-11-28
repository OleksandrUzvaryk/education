package extratasks.addHomework3.task15;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int x1 = 6564;
        int y1 = 57894;
        int z1 = 130;
        int  expectResult1 =  x1;  // true
        int actualResult1 = calculator.compareTwoNumber(x1,y1,z1);

        if (expectResult1 == actualResult1){System.out.println("Test-1 is passed, number 1 bigger than number 2 and 3!");}
        else {System.out.println("Test-1 test is failed!!!");}

        System.out.println("_______________________________");

        int x2 = 845;
        int y2 = 100;
        int z2 = 10;
        int  expectResult2 =  y2;
        int actualResult2 = calculator.compareTwoNumber(x2,y2,z2);
        if (expectResult2 == actualResult2){System.out.println("Test-2 is passed, number 2 bigger than number 1 and 3!");}
        else {System.out.println("Test-2 is failed!!!");}


        System.out.println("_______________________________");

        int x3 = 100;
        int y3 = 100;
        int z3 = 1000;
        int  expectResult3 =  z3;
        int actualResult3 = calculator.compareTwoNumber(x3,y3,z3);
        if (expectResult3 == actualResult3){System.out.println("Test-3 passed, number 3 bigger than number 1 and number 2 !");}
        else {System.out.println("Test-3 is failed!!!");}

        int x4 = 100;
        int y4 = 100;
        int z4 = 20;
        int  expectResult4 =  x4;
        int actualResult4 = calculator.compareTwoNumber(x4,y4,z4);
        if (expectResult4 == actualResult3){System.out.println("Test-4 passed, number 1 and 2 the same. Bigger than number 3 !");}
        else {System.out.println("Test-3 is failed!!!");}



    }
}
