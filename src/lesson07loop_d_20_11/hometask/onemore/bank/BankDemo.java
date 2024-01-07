package lesson07loop_d_20_11.hometask.onemore.bank;

public class BankDemo {

    public static void main(String[] args) {

        Bank bank = new Bank();

        int balance = bank.createBalance();
        int dayCounter = 0;
        System.out.println("Your balance has " + balance + " money");

        while (balance>0){
            int maxDel = bank.getDel(balance);
            balance = balance - maxDel;
            dayCounter++;
            System.out.println("Day " + dayCounter + " Amount cash is " + maxDel + " Money left" + balance);
        }










    }


}
