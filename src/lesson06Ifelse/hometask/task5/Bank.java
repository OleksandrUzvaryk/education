package lesson06Ifelse.hometask.task5;

public class Bank {

    public static int dayCounter(long amount) {

        long balance = amount;

        long findDivider = findeDiv(amount);
        int dayCount = 0;

        while (balance != 0L) {

            balance = balance - findDivider;
            findDivider = findeDiv(balance);
            dayCount++;
        }
        return dayCount;
    }

    public static long findeDiv(long amount) {
        int findDivider = 1;

        for (int i = 2; i < amount; i++) {

            if (amount % i == 0) {
                findDivider = i;
            }
        }
        return findDivider;
    }

   public static void main(String[] args) {
        // створити ньюв
        System.out.println(dayCounter(1));
    }

}



