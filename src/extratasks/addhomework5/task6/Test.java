package extratasks.addhomework5.task6;

public class Test {

    public static void main(String[] args) {

        Task6 task6 = new Task6();

        int x = 129;
        boolean expectResult = true;
        boolean actualResult = task6.isEven(x);
        if (expectResult == actualResult){System.out.println("Test is passed, number is even!");}
        else {System.out.println("Test  is failed!!!");}


    }



}
