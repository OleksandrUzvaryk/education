package lesson06Ifelse_d_17_11.hometask.onemore.task1;

public class ShopDemo {
    public static void main(String[] args) {
        Shop service = new Shop();

        boolean firstTry = service.canBuy(false, false);
        System.out.println("I can buy product=> " + firstTry);

        boolean secondTry = service.canBuy(true, false);
        System.out.println("I can buy product=> " +secondTry);

    }
}
