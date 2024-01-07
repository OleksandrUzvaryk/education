package lesson07loop_d_20_11.lessontasks.onemore;

public class Service {

    public boolean checkNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                return false;
            }

        }   return true;
    }





}
