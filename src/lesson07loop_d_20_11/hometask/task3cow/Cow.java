package lesson07loop_d_20_11.hometask.task3cow;

public class Cow {
    /*Цель: Склонение слова "корова" в зависимости от числа n.
    Входные данные: Целое положительное число n (n ≤ 10).
    Выходные данные: Фраза "На лугу пасется n коров(а/ы)".*/

    public String cowFraze(int n) {


        String fraze = "";
        if (n < 1 || n > 10 ){
            fraze = " Указано неправильное количество коров";
        }

        else if (n == 1) {
            fraze = " На лугу пасется " + n + " корова";
        } else if (n >= 2 && n <= 4) {
            fraze = " На лугу пасется " + n + " коровы";
        } else  {
            fraze = " На лугу пасется " + n + " коров";
        }

        return fraze;

    }

}
