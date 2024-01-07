package lesson_11_search_and_sort_d_29_11.hometask.binary_2_my_method;

public class Binary2 {

    int binarySearch2(int [] array, int element) {

        int leftSide = 0;
        int rightSide = array.length - 1;

        while (leftSide <= rightSide ) { // условие пока левая и правая границы поиска не пересеклись
            if (element > array [array.length - 1] || element < array[0]) {
                System.out.println("The number is not in the array "); return -1;} // условие для неподходящего числа

            int middleIndex = (leftSide + rightSide) / 2;
            int currentNumber = array[middleIndex];

             if (currentNumber == element) {
                System.out.println("\nSearch element " + element + " in the our array has index " + middleIndex);
                return  middleIndex;}

           else  if (currentNumber < element) {
                leftSide = middleIndex + 1;}
          else   if (currentNumber > element){
                rightSide = middleIndex - 1;}

        } {return -1;}

    }
}
