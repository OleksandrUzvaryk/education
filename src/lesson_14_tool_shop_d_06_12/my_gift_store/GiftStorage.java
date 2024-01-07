package lesson_14_tool_shop_d_06_12.my_gift_store;

import java.util.Arrays;

public class GiftStorage {

    Gift [] gifts ;

    public GiftStorage() {
       gifts = new Gift[6];
       gifts[0]= new Gift(01,"watch",120,false);
       gifts[1]= new Gift(02,"food",10,true);
       gifts[2]= new Gift(03,"parfume",420,true);
       gifts[3]= new Gift(04,"phone",170,false);
       gifts[4]= new Gift(05,"tv",130,false);
       gifts[5]= new Gift(06,"picture",1620,true);
    }

    public Gift[] getGifts() {
        return gifts;
    }

    @Override
    public String toString() {
        return "GiftStorage{" +
                "gifts=" + Arrays.toString(gifts) +
                '}';
    }
}
