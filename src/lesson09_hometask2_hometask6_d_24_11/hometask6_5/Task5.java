package lesson09_hometask2_hometask6_d_24_11.hometask6_5;

public class Task5 {

    /*
    Снять деньги
У вас на банковском счету N долларов.
ВЫ хотите снять все, но банк разрешает снять только сумму,
которая является делителем текущей суммы на счету и меньше текущей суммы.
Если вы снимаете максимально возможную сумму каждый день,
сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
Примечание: если оставшаяся сумма равна 1, вы можете снять ее.

Пример
Ввод:  N = 21
Выход:  7
Объяснение:  N = 21
Снято 7, осталось = 14
Снято 7, осталось = 7
Снято 1, осталось = 6
Снято 3, осталось = 3
Снято 1, осталось = 2
Снято 1, Осталось = 1
Снято 1, осталось = 0

     */
    /*
        наша основная задача: подсчет количества дней
        1) вычислять максимальный делитель для некоего числа
        2) уменьшение остатка на счете на этот делитель
        3) посчитать количество итераций которые нам необходимы для снятия всей суммы

         */
    public static void main(String[] args) {

        BankService bankService = new BankService();

        int accountBalance = bankService.getBalance(); // запрос рандомного баланса
        System.out.println("On account received - " + accountBalance);

        int dayCounter = 0;

    while (accountBalance > 0){
        int withdraw = bankService.getDraw(accountBalance); // вызов метода для вычесления наибольшего делителя

        accountBalance = accountBalance - withdraw;
        dayCounter++;

        System.out.println("Day " + dayCounter + "снятая сумма " + withdraw + " остаток " + accountBalance);

        }
    }
}
