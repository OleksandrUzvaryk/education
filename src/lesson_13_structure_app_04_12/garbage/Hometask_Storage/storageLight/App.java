package lesson_13_structure_app_04_12.garbage.Hometask_Storage.storageLight;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

         Kit [] kit = new Kit[2];
        Scanner scanner = new Scanner(System.in);



        //System.out.println(Arrays.toString(kit)); // пусто
       // System.out.println("Please write tools for your kit 1 ");
        kit [0] = new Kit("drill", "hammer");
        //System.out.println("Please write tools for your kit 2 ");
        kit [1] = new Kit("saw", "stepler");


        System.out.println(Arrays.toString(kit));
        kit[0].tools1 = "DDDDDDDDDDDDD";
        System.out.println(Arrays.toString(kit));





    }


}
