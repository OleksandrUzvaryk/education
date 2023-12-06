package lesson_13.hometask_Tools_Storage;

public class SetArray {

    SetTools [] setTools = new SetTools [3]; // создаем массив для наборов

    public SetTools[] getSetTools() { // создаем метод - геттер для возвращения значений наборов
        return setTools;
    }

    public void printArray() {

        for (int i = 0; i < getSetTools().length; i++) {
            System.out.println("Набор " + (i + 1) + " Состав: " + getSetTools()[i].tools[0] + ", " + getSetTools()[i].tools[1]);
        }

    }
}

