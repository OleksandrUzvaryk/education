package lesson04meth_13_11.robot;

public class Robot {
    String model;

    // конструктор
    public Robot(String model) {
        this.model = model;
    }

    public void speakHello(){
        System.out.println("Hello!");
        System.out.println("I am Robot " + model + " !!!");
    }

    public double makeChange(double amount, double exchan){

        double result = amount * exchan ;
        return result;
    }

}
