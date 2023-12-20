package example.array.check_unique_elements;

public class Uniqe {


    /*
Напишите метод, который проверяет, все ли элементы в массиве уникальны.
Функция должна возвращать `true`, если все элементы уникальны, и `false`,
если найдены дубликаты.

     */
    public boolean checkAllElementsUnique(int[] workingArray){
        for (int i = 0; i < workingArray.length; i++) {
            for (int j = i + 1; j < workingArray.length; j++) {
                if (workingArray[i] == workingArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
// передем в цикл массив, первый цикл  крутит массив, второй цыкл перебирает его значение на уникальность


