package lesson07Loop.hometask.addLoop;

import java.util.Scanner;

public class Task3CheckWord {


        /*Программа запрашивает у пользователя слово "hello". Если слово введено верно, программа благодарит и завершает работу.
    В противном случае запрашивает ввести слово снова.
     Опционально: Считать количество попыток, требуемых для введения правильного слова. По окончанию вывести это число.*/


        public void checkWord(){
            Scanner scanner = new Scanner(System.in);
            String word = "";
            int iteration = 0;

            while (!word.equals("hello")) {
                System.out.println("Введите слово 'hello': ");
                word = scanner.nextLine();
                iteration++;
            }

            System.out.println("Вы справились! Количество попыток: " + iteration);
        }
    }


