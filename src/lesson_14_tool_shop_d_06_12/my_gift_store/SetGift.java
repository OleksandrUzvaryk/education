package lesson_14_tool_shop_d_06_12.my_gift_store;

import java.util.Arrays;

public class SetGift {

  Gift [] setgifts = new Gift[2];

    public SetGift(Gift gift1, Gift gift2) {
        setgifts[0]=gift1;
        setgifts[1]=gift2;
    }


    public Gift[] getSetgifts() {
        return setgifts;
    }

    @Override
    public String toString() {
        return "SetGift{" +
                "setgifts=" + Arrays.toString(setgifts) +
                '}';
    }
}
