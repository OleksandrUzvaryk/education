package lesson03Meth.hometasks;

public class Task3PriceDemo {
    public static void main(String[] args) {

        // реализация через метод без возврата значений
        Task3Price buyProduct = new Task3Price();
        buyProduct.aProduct = 1000;
        buyProduct.bProduct = 500;
        buyProduct.cDiscount = 100;
        buyProduct.printBuyProd();
        buyProduct.printMakeDisc();
        System.out.println("------------------------------------------");

       /* // реализация через метод c возвратом значений
        int result = buyProduct.printBuyProd2(1000,500,100);
        System.out.println("Сумма покупки 2 товаров = " + result);
        result = buyProduct.printMakeDisc2(1000,500,1500);
        System.out.println("Сумма скидки = " + result);*/

    }
}
