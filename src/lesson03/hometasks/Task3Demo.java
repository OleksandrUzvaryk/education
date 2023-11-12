package lesson03.hometasks;

public class Task3Demo {
    public static void main(String[] args) {

        Task3 buyProduct = new Task3();
        buyProduct.aProduct = 1000;
        buyProduct.bProduct = 500;
        buyProduct.cDiscount = 100;

        buyProduct.buyProd();
        buyProduct.makeDisc();

    }
}
