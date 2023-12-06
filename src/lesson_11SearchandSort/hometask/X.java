package lesson_11SearchandSort.hometask;

public class X {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int element = -1;

        int leftSide = 0;
        int rightSide = array.length - 1;

        int currentNumber = -1; // не от о, если будет  0 - цыкл не запустится поскольку условие нарушено


        while (leftSide <= rightSide && currentNumber != element) { // условие пока левая и правая границы поиска не пересеклись

            if (element > array.length-1 || element < array[0]) {System.out.println("You put incorrect number"); break;}

            int middleIndex = (leftSide + rightSide) / 2;
            currentNumber = array[middleIndex];

            if (currentNumber == element) {System.out.println("\nSearch element " + element + " in the our array has index " + middleIndex);}

            if (currentNumber < element) {leftSide = middleIndex + 1;}

            if (currentNumber > element){rightSide = middleIndex - 1;}

        }

    }

}


