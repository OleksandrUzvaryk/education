package extratasks.addHomework3.task3;

public class Product {

    String name;
    double regularPrice;
    double discountPercent;

    public Product(){

    }
    public Product(String name){
        this.name = name;
    }

    public double actualPrice(){
        double discountMoney = discountPercent * regularPrice / 100;
        double result =  regularPrice - discountMoney;
        return result;
    }

    public void printInformation(){
        System.out.println("Product has name " + name + "\n His regular price is: " + regularPrice +
                "\n His discount is: " + + discountPercent + "\n His actual price is: "  + actualPrice());
    }


}
