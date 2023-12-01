package lesson_11.hometask;

public class X {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int element = 100;

        int leftSide = 0;  // начальный 0 индекс
        int rightSide = array.length - 1; // конечный индекс

        int currentNumber = 0;

        while (leftSide <= rightSide && currentNumber != element) { // условие пока левая и правая границы поиска не пересеклись

            int middleIndex = (leftSide + rightSide) / 2;  // делим длинну масива пополам
            currentNumber = array[middleIndex]; // текущее число в и среднем индексе делаем - делаем числом с которым сравниваем искомое число

            if (currentNumber == element) { // если текущее число равно искомому - вывод

                System.out.println("Search element " + element + " in the our array has index " + middleIndex);
            }
             else if (currentNumber < element) { // если текущее число в среднем индексе меньше искомого - в следущей итерации+1 к средине и новая итерация

                leftSide = middleIndex + 1;
            }
              else if (currentNumber > element){
                // если текущее число в среднем индексе больше искомого - в следущей итерации -1  к средине и новая итерация
                rightSide = middleIndex - 1;}}

    }}


