package example.methods;

public class Print_Strings {

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
