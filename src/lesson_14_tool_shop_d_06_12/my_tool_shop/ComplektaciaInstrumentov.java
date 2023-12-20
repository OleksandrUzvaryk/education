package lesson_14_tool_shop_d_06_12.my_tool_shop;

import java.util.Arrays;

public class ComplektaciaInstrumentov {

    Instrument [] complectacia = new Instrument[2];


    public ComplektaciaInstrumentov(Instrument instrument1, Instrument instrument2) {
        complectacia[0] = instrument1;
        complectacia[1] = instrument2;
    }

    public Instrument[] getComplectacia() {
        return complectacia;
    }

    @Override
    public String toString() {
        return "ComplektaciaInstrumentov{" +
                "complectacia=" + Arrays.toString(complectacia) +
                '}';
    }
}
