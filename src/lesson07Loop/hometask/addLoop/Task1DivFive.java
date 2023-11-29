package lesson07Loop.hometask.addLoop;

public class Task1DivFive {

   // Распечатать все числа от 1 до 100, делящиеся на 5 без остатка. Использовать цикл do-while.

    public void divByFive (int myNumber){
        int i = 1;
        do {
            if (i % 5 == 0){System.out.println(i);}
            i++;}
        while (i <= 100);
    }
}
