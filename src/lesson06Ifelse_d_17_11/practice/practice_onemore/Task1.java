package lesson06Ifelse_d_17_11.practice.practice_onemore;

public class Task1 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        int userNumber = userInput.uiInt("Put your positive number!");


        int point10 = 10;
        int point100 = 100;
        int point1000 = 1000;

        int dif10 = Math.abs(userNumber - point10);
        int dif100 = Math.abs(userNumber - point100);
        int dif1000 = Math.abs(userNumber - point1000);

        if (dif10 < dif100) {
            System.out.println("Closer to 10"); // 30 - 10 = 20.........30-100=70........
        } else if (dif100 < dif1000) {
            System.out.println("Closer to 100");
        } // 250-100=150.....250-1000=750....

        else {
            System.out.println("Closer to 1000");
        }
        // 2 вариант

        if (dif1000 < dif100) {
            System.out.println("Closer to 1000");
        }  // 700-1000=300.....700-100=600
        else if (dif100 < dif10) {
            System.out.println("Closer to 100");
        } // 145 -100 = 45......145-10=135
        else {
            System.out.println("Closer to 10");


        }

    }
}
