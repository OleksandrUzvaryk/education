package lesson07loop_d_20_11.lessontasks.task2;

public class SimpleNumber {

    public boolean isSimple(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
    return true;
    }


}
 /*   проверить является ли число которое ввел пользователь - простым
        (делится без остатка только на 1 и на себя)*/

// Год является високосным, если он делится на 4 без остатка, и либо не делится на 100, либо делится на 400.