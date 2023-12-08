package lesson_14_tool_shop.my_tool_shop;

import java.util.Arrays;

public class SkladNaborov {

    ComplektaciaInstrumentov [] nabor = new ComplektaciaInstrumentov[3];

    public SkladNaborov(ComplektaciaInstrumentov complectacia1,ComplektaciaInstrumentov complectacia2, ComplektaciaInstrumentov complectacia3) {
        nabor [0] = complectacia1;
        nabor[1] = complectacia2;
        nabor[2] = complectacia3;
    }

    public ComplektaciaInstrumentov[] getNabor() {
        return nabor;
    }

    public void setNabor(ComplektaciaInstrumentov[] nabor) {
        this.nabor = nabor;
    }

    @Override
    public String toString() {
        return "SkladNaborov{" +
                "nabor=" + Arrays.toString(nabor) +
                '}';
    }
}
