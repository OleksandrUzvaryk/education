package lesson03.hometasks;

public class Task3 {

    public int aProduct;
    public int bProduct;
    public int cDiscount;

    public void buyProd(){
        int result1 = (aProduct + bProduct) - cDiscount;
        System.out.println("Сумма покупки 2 товаров = " + result1);
    }
    public void makeDisc(){
        int result2 = cDiscount;
        System.out.println("Сумма скидки = " + result2);
    }
}
