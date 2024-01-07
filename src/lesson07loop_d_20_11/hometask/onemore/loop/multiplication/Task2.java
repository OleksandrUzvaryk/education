package lesson07loop_d_20_11.hometask.onemore.loop.multiplication;

public class Task2 {

    public static void main(String[] args) {

       /* Цель: С помощью цикла for/while написать программу, выводящую результат умножения числа n на все целые числа от 0 до n.
        Пример: Для числа 3, результат будет 0, 3, 6, 9.
        */

        int n = 3;
        for (int i = 0; i <= n; i++) {
            int result = i * n;
            System.out.println(result);

        }
    }
}
