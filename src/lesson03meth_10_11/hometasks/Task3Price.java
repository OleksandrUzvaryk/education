package lesson03meth_10_11.hometasks;

public class Task3Price {

    public int aProduct;
    public int bProduct;
    public int cDiscount;

    // реализация через метод без возврата значений
    public void printBuyProd(){
        int result = (aProduct + bProduct) - cDiscount;
        System.out.println("Сумма покупки 2 товаров = " + result);
    }
    public void printMakeDisc(){
        int result = cDiscount;
        System.out.println("Сумма скидки = " + result);
    }
    // реализация через метод c возвратом значений
       public int fullPrice;
    public int printBuyProd2(int aProduct, int bProduct, int cDiscount){
        int result = (aProduct + bProduct) - cDiscount;
        return result;
    }
    public int printMakeDisc2(int aProduct, int bProduct,  int fullPrice) {
        int result =fullPrice - (aProduct + bProduct) + 100;
        return result;
    }
}


