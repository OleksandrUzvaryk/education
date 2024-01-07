package lesson07loop_d_20_11.hometask.onemore.bank;

import java.util.Random;

public class Bank {

    public int createBalance() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    public int getDel(int balance) {
        for (int i = balance / 2; i > 0; i--) {
            if (balance % i == 0) {
                return i;
            }

        }
        return 1;
    }


}
