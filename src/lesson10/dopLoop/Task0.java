package lesson10.dopLoop;


// Распечатать 10 строк: "Task1", "Task2", ..., "Task10". Использовать цикл for/while.
public class Task0 {
    public static void main(String[] args) {

        String name = "task";
        int counter = 0;
        while (counter < 10 && counter >= 0){
            counter++;
            System.out.println(name + counter);
        }
    }
}
