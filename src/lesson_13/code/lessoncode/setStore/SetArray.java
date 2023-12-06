package lesson_13.code.lessoncode.setStore;

public class SetArray {

    SetTools[] setTools = new SetTools[3]; // массив наборыв


    public SetTools[] getSetTools() {
        return setTools;
    }


    public void printArray() {

        /*if (setTools[0] != null && setTools[1] != null && setTools[2] != null ) {*/
            for (int i = 0; i < getSetTools().length; i++) {
                System.out.println("Набор " + (i + 1) + " Состав: " + getSetTools()[i].tools[0] + ", " + getSetTools()[i].tools[1]);
            }

       /* } else {
            System.out.println("Array is empty");
        }*/
    }

}
