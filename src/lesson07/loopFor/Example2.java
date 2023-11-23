package lesson07.loopFor;

public class Example2 {

    public static void main(String[] args) {

        String workString = "For lesson07.hometask.loop example.";

        for (int i = 0; i < workString.length(); i++) {
            System.out.println(i + "  char from our string - " + workString.charAt(i));
        }

        System.out.println("-------");

        int counter = 0;

        while (counter < workString.length()){
            System.out.println(counter + "  char from our string - " + workString.charAt(counter));
            counter++;
        }

    }
}
