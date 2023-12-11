package lesson_13_structure_app_04_12.hometask_Tools_Storage;

public class SetToolsShop {

    public static void main(String[] args) {

        UiMethod uiMethod = new UiMethod();

        String[] myTolls1 = new String[2]; // создаем  массив для инструментов комбинация 1

        //System.out.println("Please enter your equipment");
        //System.out.println("Number 1: ");
        //myTolls1[0] = uiMethod.userInput();
       // System.out.println("Number 2: ");
        //myTolls1[1] = uiMethod.userInput();
        myTolls1[0] = "Drill";
        myTolls1[1] = "Screwdriver";

        String[] myTolls2 = new String[2];  // создаем  массив для инструментов комбинация 2
        myTolls2[0] = "Mixer";
        myTolls2[1] = "Saw";

        String[] myTolls3 = new String[2]; // создаем  массив для инструментов комбинация 3
        myTolls3[0] = "Stapler";
        myTolls3[1] = "Hammer";

        SetTools setTools1 = new SetTools(myTolls1); // вызываем конструктор - передаем туда массив - комбинация инструментов 1
        SetTools setTools2 = new SetTools(myTolls2); // вызываем конструктор - передаем туда массив - комбинация инструментов 2
        SetTools setTools3 = new SetTools(myTolls3); // вызываем конструктор - передаем туда массив - комбинация инструментов 3

        SetArray setArray = new SetArray(); // создаем ссылочную переменную для обращению к методу для заполения массивов наборов

        setArray.getSetTools()[0] = setTools1;  // в Набор-1 передано значение массива myTolls1
        setArray.getSetTools()[1] = setTools2;  // в Набор-2 передано значение массива myTolls2
        setArray.getSetTools()[2] = setTools3;  // в Набор-3 передано значение массива myTolls3

        setArray.printArray();
        System.out.println("--------------------------------------------------------------------");

        /*System.out.println(" Временное размещение  значения инструментов в Набор 3 / комбинации 3 ");
        myTolls3[1] = "QQQQQQQQQQQQQQQQ"; // временная замена значение инструментов в комбинации 3
        setArray.printArray();*/


        System.out.println(" Размещение инструментов Набор-1 в Набор-3 ");
        setArray.getSetTools()[2] = setTools1; // помещение комбинации инструментов Набор-1 в Набор-3
        setArray.printArray();

        System.out.println(" Размещение в Набор- 1,3 нового значения второго инструмента из комбинации 1 ");
        setArray.getSetTools()[2].tools[1] = "Laser level"; // помещение в Набор-3 нового значения второго инструмента из комбинации 1
        setArray.printArray();





    }



}
