package extratasks.addHomework3.task4;

class BankAccount {

   public String owner;
    public int money;

    public BankAccount(String owner,int money) {
        this.owner = owner;
        this.money = money;
    }

   public String getOwner() {
       return owner;
    }

   public int getMoney() {
        return money;
    }

}