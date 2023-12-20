package example.methods;

public class Sum_Digits_In_NUmber {

    public int sumOfDigits(int number){
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        /*
        123
        sum = 0 123
        sum = 0 + 3, number = 12
        sum = 3 + 2, number = 1
        sum = 5 + 1 = 6 , number = 1 / 10 = 0
         */

        return sum;
    }

}
