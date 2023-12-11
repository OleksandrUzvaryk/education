package lesson_15_08_12.hometask.task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова одной строкой через пробел");
        String input = scanner.nextLine();

        int count = 0; //Начальное количество слов равно 0


        if(input.length() != 0){  //Если ввели хотя бы одно слово, тогда считать, иначе конец программы
            count++;

            for (int i = 0; i < input.length(); i++) { //Проверяем каждый символ, не пробел ли это
                if(input.charAt(i) == ' '){  //Если пробел - увеличиваем количество слов на 1

                    count++;
                }
            }
        }

        System.out.println("Вы ввели "+count+"слов");
    }

}
