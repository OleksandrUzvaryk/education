package extratasks.addhomework3.task4;

class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Vasul", 457); // на основании класса Банкакаунт,
        // создали новый екземпляр класса - конструктор с 2 параметрами

        String ownerFirstName = bankAccount.getOwner(); // через методы возврата геттеры вернули значение имени и количества денег
        int  moneyAmount = bankAccount.getMoney();

        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}
