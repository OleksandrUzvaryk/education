package example.array.perevorot_massiva_cherez_dopmassiv;

public class Task1ArrayRollOwer {
                //Перевернуть массив: Создайте метод, который принимает массив целых чисел и возвращает другой массив, состоящий из
                // элементов первого в перевернутом порядке. Например, если входной массив [1, 2, 3, 4], то результат должен быть [4, 3, 2, 1].



        public int[] reverseArray(int[] workingArray){

            int[] reverseArray = new int[workingArray.length];
            for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[i] = workingArray[reverseArray.length - 1 -i]; // идекс нового масива =  присваивает значение индексу старого массива -1 -і
            }
            return reverseArray;
        }
    }

