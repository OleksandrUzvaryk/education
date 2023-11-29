package lesson08Arrays.hometask.task2;

public class Task2Uniqe {

    /*
Напишите метод, который проверяет, все ли элементы в массиве уникальны.
Функция должна возвращать `true`, если все элементы уникальны, и `false`,
если найдены дубликаты.

     */

    public boolean checkAllElementsUnique(int[] workingArray){
        for (int i = 0; i < workingArray.length; i++) {
                                                                        // комбинация 1233  // 1223
            for (int j = i + 1; j < workingArray.length; j++) {  //  j= 0  +1 =  1,2,3  <4 0!=1,2,3
                System.out.println("J" + "-" + j);               //  j= 1  +1 =  2,3    <4    1!= 2,3
                if (workingArray[i] == workingArray[j]) {        //  j= 2 +1 = 3      <4        2!= 3
                    System.out.println("Point " + workingArray[i]);         //   j= 3+1 = 4!!!  цыкл 2 закончился
                                                                    // и текущее i = 3 == старому значению j=3
                    return false;                                   // ретурн Фелс
                }
            }
        }
        return true;
    }

}
 // передем в цикл массив, первый цикл считает крутит массив, второй цыкл прокручивает его значение на уникальность
