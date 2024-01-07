package lesson07loop_d_20_11.loopFor.onemore;

public class Task2 {
    public static void main(String[] args) {
        // распечатать строку посимвольно через цикл

        String myPhrase = "I found peace!";

        for (int i = 0; i <myPhrase.length() ; i++) {
            System.out.println(0 + " char is " + myPhrase.charAt(i));
        }
        System.out.println("------------------------------------------");
        int counter = 0;
        while (counter<myPhrase.length()){
            System.out.println(0 + " char is " + myPhrase.charAt(counter));
            counter++;
        }

    }
}
