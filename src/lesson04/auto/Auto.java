package lesson04.auto;

public class Auto {
    String model;
    double engineVolume;
    String color;
    boolean transmissionType;
    public  Auto (String model,double engineVolume, String color,boolean transmissionType){

        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.transmissionType = transmissionType;
    }
    public void sound(){
        System.out.println(model + "Beapppppppp!!!");
    }
     public void startEngine(){
        System.out.println(model + "Start!!!");
    }
    public void offEngine(){
        System.out.println(model + "Stop!!!");
    }

}
