package lesson_13_structure_app_d_04_12.code.lessoncode.setStore;

import java.util.Scanner;

public class SetToolsShop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


      /*  String[] allTolls = new String[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Put "+(i + 1)+" equipment");
            allTolls[i] = scanner.nextLine();
        }
    */

        String[] myTolls1 = new String[2];
       System.out.println("Put first equipment");
        //myTolls1[0] = allTolls[0];
        //myTolls1[0] = scanner.nextLine();
        //System.out.println("Put second equipment");
        //myTolls1[1] = scanner.nextLine();

        String[] myTolls2 = new String[2];
        myTolls2[0] = "Mixer";
        myTolls2[1] = "Saw";

        String[] myTolls3 = new String[2];
        myTolls3[0] = "Fen";
        myTolls3[1] = "Roller";


        SetTools setTool1 = new SetTools(myTolls1); // викликаю конструктор
        SetTools setTool2 = new SetTools(myTolls2); // викликаю конструктор
        SetTools setTool3 = new SetTools(myTolls3); // викликаю конструктор

        SetArray setArray = new SetArray();
        setArray.getSetTools()[0] = setTool1;
        setArray.getSetTools()[1] = setTool2;
        setArray.getSetTools()[2] = setTool3;

        setArray.printArray();

        myTolls3[1] = "QQQQQQQQQQQQQQQQ";
        setArray.printArray();
        setArray.getSetTools()[2] = setTool1;
        setArray.printArray();

        setArray.getSetTools()[2].tools[1] = "HHHHHHH";
        setArray.printArray();
        /*"Набор 1". Состав: дрель, отвертка.
                "Набор 2". Состав: плоскогубцы, молоток.
        */
    }

}
