package lesson08arrays_22_11.hometask.task2;

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
