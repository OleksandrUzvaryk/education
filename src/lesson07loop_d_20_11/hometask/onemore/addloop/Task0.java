package lesson07loop_d_20_11.hometask.onemore.addloop;

public class Task0 {
    public static void main(String[] args) {
        //Цель: Распечатать 10 строк: "Task1", "Task2", ..., "Task10". Использовать цикл for/while.

        String myString = "Task";

        for (int i = 0; i <=10 ; i++) {
            System.out.println(myString + " "  +i);

        }
        int counter = 0;
        while (counter<=10){
            System.out.println(myString + " "  +counter);
            counter++;
        }
    }
}
