
package lesson_11SearchandSort.hometask;

public class Binary {

    int binarySearch(int[] array, int element) {
        // в начале левая и правая границы равны первому и последнему элементу массива

        int leftSide = 0;  // начальный 0 индекс
        int rightSide = array.length - 1; // конечный индекс



        while (leftSide <= rightSide) { // условие пока левая и правая границы поиска не пересеклись

            int middleIndex = (leftSide + rightSide) / 2;  // делим длинну масива пополам
            int current = array[middleIndex]; // текущее число в и среднем индексе делаем - делаем числом с которым сравниваем искомое число
            if (current == element) { // если текущее число равно искомому - вывод

                return middleIndex;
            }
            else if (current < element) { // если текущее число в среднем индексе меньше искомого - сдвигаемся к центру на +1, и новая итерация

                leftSide = middleIndex + 1;
            }
            else if (current > element){
                // если текущее число в среднем индексе больше искомого - сдвигаемся к центру на -1, и новая итерация
                rightSide = middleIndex - 1;}

        } return -1;
        // проверили весь массив, но не нашли элемент

    }

        }



















