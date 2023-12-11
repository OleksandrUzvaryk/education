package lesson_15_08_12.hometask.task5;

public class Task5 {

    public static void main(String[] args) {

        int mas1[] = new int[12];

        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) Math.floor(Math.random() * 31) - 15;  // 31 количество возможных чисел в диапазоне -15 0 +15....
            System.out.println(mas1[i] + " ");

        }
        int max = mas1[0], index = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] >= max ) {
                max = mas1[i];
                index = i;
            }
        }
        System.out.println("Самое большое число " + max + " и индекс его последнего вхождения " + index);
    }


}
