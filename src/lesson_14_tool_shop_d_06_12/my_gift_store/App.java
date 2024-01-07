package lesson_14_tool_shop_d_06_12.my_gift_store;

import java.util.Arrays;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        GiftStorage myStorage = new GiftStorage();

        SetGift set1 = new SetGift(myStorage.getGifts()[0], myStorage.getGifts()[1]);
        SetGift set2 = new SetGift(myStorage.getGifts()[2],myStorage.getGifts()[3]);
        SetGift set3 = new SetGift(myStorage.getGifts()[4],myStorage.getGifts()[5]);

        SetGiftStorage giftBox = new SetGiftStorage(set1,set2,set3);

        for (int i = 0; i <giftBox.getGeneralStorage().length ; i++) {
            System.out.println("My set " + i );
            //System.out.println(giftBox.getGeneralStorage()[i].getSetgifts()[i]); // альтернатива mySet

            SetGift mySet = giftBox.getGeneralStorage()[i]; // переменная для вывода набора подарков
            //System.out.println(mySet);
            Gift gift1FromSet = mySet.getSetgifts()[0]; // ссылка на подарок 1
            Gift gift2FromSet = mySet.getSetgifts()[1]; // ссылка на подарок 1


            System.out.println("Id " + gift1FromSet.getId());
            System.out.println("Price " + gift1FromSet.getPrice());
            System.out.println("Special " + gift1FromSet.isSpecial());
            System.out.println("Name " + gift1FromSet.getName());

            System.out.println("Id " + gift2FromSet.getId());
            System.out.println("Price " + gift2FromSet.getPrice());
            System.out.println("Special " + gift2FromSet.isSpecial());
            System.out.println("Name " + gift2FromSet.getName());

            System.out.println("________________________________________");
        }











    }


}
