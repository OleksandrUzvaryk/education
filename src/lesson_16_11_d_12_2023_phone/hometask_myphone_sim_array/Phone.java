package lesson_16_11_d_12_2023_phone.hometask_myphone_sim_array;

import java.util.Arrays;

public class Phone {

    private int imei;

    private SimCard[] simCards = new SimCard[2];


    private Cases cases;

    private String model;


    public Phone(int imei, String model) {
        this.imei = imei;
        this.model = model;
    }

    public void setOneSimCard(SimCard simCard, int numberOfCell) {
        simCards[numberOfCell] = simCard;
    }

    public void setSimCard(SimCard[] simCards) {
        this.simCards = simCards;
    }


    public int getImei() {
        return imei;
    }


    public SimCard[] getSimCard() {
        return simCards;
    }


    public Cases getCases() {
        return cases;
    }

    public void setCases(Cases cases) {
        this.cases = cases;
    }

    public String getModel() {
        return model;
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
