package lesson_16_11_12_2023.hometask_myphone.method_caseon_caseoff;

public class Phone {

    private int imei;

    private SimCard simCard;

    private SimCard simCardTwo;

    private Cases cases;

    private String model;


    public Phone(int imei, String model) {
        this.imei = imei;
        this.model = model;
    }

    public int getImei() {
        return imei;
    }


    public SimCard getSimCard() {
        return simCard;
    }

    public void setSimCard(SimCard simCard) {
        this.simCard = simCard;
    }

    public SimCard getSimCardTwo() {
        return simCardTwo;
    }

    public void setSimCardTwo(SimCard simCardTwo) {
        this.simCardTwo = simCardTwo;
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
                ", simCard=" + simCard +
                ", simCardTwo=" + simCardTwo +
                ", cases=" + cases +
                ", model='" + model + '\'' +
                '}';
    }
}
