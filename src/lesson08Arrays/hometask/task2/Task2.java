package lesson08Arrays.hometask.task2;

import java.lang.reflect.Array;

public class Task2 {

    public static void main(String[] args) {

        /*
        Напишите метод, который проверяет, все ли элементы в массиве уникальны.
        Функция должна возвращать `true`, если все элементы уникальны, и `false`,
        если найдены дубликаты.

             */
        int [] workingArray = {1,2,3,3};

        Task2Uniqe unique = new Task2Uniqe();
        boolean result = unique.checkAllElementsUnique(workingArray);
        System.out.println(result);

    }

}
