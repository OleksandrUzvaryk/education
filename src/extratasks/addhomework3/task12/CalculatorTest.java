
package extratasks.addhomework3.task12;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

            int x1 = 10;
            int y1 = 20;
            int expectationResult = 30;
            int actualResult1 = calculator.sum(x1,y1);

            if (expectationResult == actualResult1){System.out.println("Sum test is passed!");}
                else {System.out.println("Sum test is failed!!!");}

            int x2 = 10;
            int y2 = 20;
            int expectationResult2 = -10;
            int actualResult2 = calculator.sub(x2,y2);
            if (expectationResult2 == actualResult2){System.out.println("Sub test is passed!");}
                else {System.out.println("Sub test is failed!!!");}

            int x3 = 10;
            int y3= 20;
            int expectationResult3 = 200;
            int actualResult3 = calculator.mul(x3,y3);
            if (expectationResult3 == actualResult3){System.out.println("Sub test is passed!");}
            else {System.out.println("Sub test is failed!!!");}

            int x4 = 10;
            int y4= 20;
            double expectationResult4 = 0.5;
            double actualResult4 = calculator.div(x4,y4);
            if (expectationResult4 == actualResult4){System.out.println("Sub test is passed!");}
            else {System.out.println("Sub test is failed!!!");}
        }

    }

