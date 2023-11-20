package extratasks.addHomework3.task_1;

public class Pc {

    String producer;
    String model;
    double price;

    Pc (String producer, String model, double price){
        this.producer = producer;
        this.price = price;
        this.model = model;
    }

    void on(){
        System.out.println("Start working");
    }
    String inputPass (String password){
        return password;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
