package lesson07loop_d_20_11.hometask.add_loop;


// Распечатать 10 строк: "Task1", "Task2", ..., "Task10". Использовать цикл for/while.
public class Task0String_Task {
    public static void main(String[] args) {


        String name = "task";
        int counter = 0;
        while (counter < 10 && counter >= 0){
            counter++;
            System.out.println(name + counter);
        }
    }

    public void printTaskNumber(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println("Task" + i);
        }
    }
}
