package lesson_14_tool_shop_d_06_12.my_gift_store;

import java.util.Arrays;

public class SetGiftStorage {

    SetGift [] generalStorage = new SetGift[3];

    public SetGiftStorage(SetGift setGifts1, SetGift setGifts2, SetGift setGifts3) {
        generalStorage[0] = setGifts1;
        generalStorage[1] = setGifts2;
        generalStorage[2] = setGifts3;
    }

    public SetGift[] getGeneralStorage() {
        return generalStorage;
    }

    public void setGeneralStorage(SetGift[] generalStorage) {
        this.generalStorage = generalStorage;
    }

    @Override
    public String toString() {
        return "SetGiftStorage{" +
                "generalStorage=" + Arrays.toString(generalStorage) +
                '}';
    }
}
