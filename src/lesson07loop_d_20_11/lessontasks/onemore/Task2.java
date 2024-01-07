package lesson07loop_d_20_11.lessontasks.onemore;



import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        Service service = new Service();
        System.out.println("Please put the number");
        int number = scanner.nextInt();
        boolean myResult = service.checkNumber(number);
        System.out.println("My number is simple, this is " + myResult);

    }

}
