package lesson_13_structure_app_d_04_12.garbage.Hometask_Storage.storageLight;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String [][] kit = {{"Hammer","Drill"}, {"Saw","Mixer"}};
        System.out.println(Arrays.toString(kit));
        System.out.println(Arrays.toString(kit[0]));
        System.out.println(Arrays.toString(kit[1]));


        for (int i = 0; i < kit.length; i++) {  // і будет прокручивать диапазон 0-2
            for (int j = 0; j < kit.length; j++) {  // j будет прокручивать диапазоны 1-4, 5-6, 7-12

                System.out.println("Kit " + i + " Equipment1 " + kit[i][j]);
            }
        }
    }
}
