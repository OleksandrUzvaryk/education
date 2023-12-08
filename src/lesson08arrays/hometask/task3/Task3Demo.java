package lesson08arrays.hometask.task3;

public class Task3Demo {

    /*
Создайте метод, который находит элемент, который встречается чаще всего в массиве целых чисел.
Если таких элементов несколько, метод может вернуть любой из них.

     */

    /*
        {1,2,3,1,2,1,2,1,2,3,2,2,2,1,1,1,1,2,2,2,2,2,1}
        1) {9,12,2,9,12,9,12,9,12,2,12,12,12,9,9,9,9,12,12,12,12,12,9}

        2) int maxNumber = 1
        int maxCounter = 9

        после того как maxCounter >= предыдущему значению (а именно 9), то
        maxNumber = 2
        maxCounter = 12

     */


    public int[] arrayFindTheSame(int[] workingArray){

        int max = workingArray[0];  // поиск максимума елемента в масиве через цикл
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] > max) {
                max = workingArray[i];
            }
        }

        int counter = 0;
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] == max) { // вычисление количества повторений максимума
                counter++;
            }
        }

        int countIndex = 0;
        int[] indexArray = new int[counter];  // создание массива для сохранения повторяющихся максимальных чисел
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] == max) {
                indexArray[countIndex] = i;
                countIndex++;
            }
        }

        return indexArray;
    }




}
