package lesson06IfElse.hometask.task1;

public class PurchaseDemo {
    public static void main(String[] args) {

       Purchase result = new Purchase();
       boolean answer = result.canBuy(true,false);
       System.out.println("I can buy food, this is " + answer);

    }
}
