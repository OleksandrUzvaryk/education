package lesson_16_11_12_2023.hometask_myphone.method_caseon_caseoff;

import java.util.Arrays;

public class SimCard {

    private int number;
    private String [] sms = new String[10];

    public SimCard(int number) {
        this.number = number;
        this.sms = sms;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String[] getSms() {
        return sms;
    }

    public void setSms(String[] sms) {
        this.sms = sms;
    }

    @Override
    public String toString() {
        return "SimCard{" +
                "number=" + number +
                ", sms=" + Arrays.toString(sms) +
                '}';
    }
}
