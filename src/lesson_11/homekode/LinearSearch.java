package lesson_11.homekode;

public class LinearSearch {

    public static void main(String[] args) {

        int [] arrayForSearch = {8,3,5,2,1,7,6};
        int elementForSearch = 5;
        // мы будем искать индекс елемента 5

        int indexSearch = -1;  // нельзя ставить 0, так как метод присвоит indexSearch =8, число в 0 индексе

        for (int i = 0; i < arrayForSearch.length; i++) {
            if (arrayForSearch[i] == elementForSearch){  // мы проходим по массиву,
                                                          // и если находим какойто еллемент массива который равен 5
                                                          // то присваиеваем его в переменную indexSearch
            indexSearch = i;
            }
        }
        if (indexSearch >= 0){System.out.println("Search element " + elementForSearch + " in the uor array has index  " + indexSearch);}
    else {
            System.out.println("Search element " + elementForSearch + " didn't find in the our array");

        }
    }
}
