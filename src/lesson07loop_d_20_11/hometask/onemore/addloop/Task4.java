package lesson07loop_d_20_11.hometask.onemore.addloop;

public class Task4 {


    public int sumNumbers(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }return  sum;


    }


}
