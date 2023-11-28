package extratasks.addHomework3.task3;

import lesson03Meth.hometasks.Task3Price;

public class ProductDemo {
    public static void main(String[] args) {

        Product myProduct = new Product();

        Product myProduct1 = new Product("Beef");
        myProduct1.regularPrice = 200.0;
        myProduct1.discountPercent = 10.0;
        myProduct1.printInformation();

        Product myProduct2 = new Product("Chees");
        myProduct2.regularPrice = 400.0;
        myProduct2.discountPercent = 20.0;
        myProduct2.printInformation();
    }
}
