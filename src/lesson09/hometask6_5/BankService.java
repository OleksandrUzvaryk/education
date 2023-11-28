package lesson09.hometask6_5;

import java.util.Random;

public class BankService {

    public int getBalance(){
        Random random = new Random();
        return random.nextInt(1000);  // рандомный возврат баланса
    }
    public int getDraw (int balance){
        for (int i = balance / 2; i > 0 ; i--) {  // поиск наибольшего делителя баланса
           if(balance % i == 0){
               return i;}
        }   return 1;
    }

}
