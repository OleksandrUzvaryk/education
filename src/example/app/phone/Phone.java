package example.app.phone;

import java.util.Arrays;

public class Phone {
    private int imei;
    private SimCard [] simCards = new SimCard[2];
    private Case cases;
    private String model;

    public Phone(int imei, String model) {
        this.imei = imei;
        this.model = model;
    }

    public void setOneSimCard (SimCard simCard, int numberOfCell){
        simCards[numberOfCell] = simCard;
    }
    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public SimCard[] getSimCards() {
        return simCards;
    }

    public void setSimCards(SimCard[] simCards) {
        this.simCards = simCards;
    }

    public Case getCases() {
        return cases;
    }

    public void setCases(Case cases) {
        this.cases = cases;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "imei=" + imei +
                ", simCards=" + Arrays.toString(simCards) +
                ", cases=" + cases +
                ", model='" + model + '\'' +
                '}';
    }
}
