package lesson03.hometasks;

public class Task6 {

    public static void main(String[] args) {
        int x = 3;
        x+=x++;
        //x = 3 + 3, приоритет: 1) инкримент, 2) комбинированый оператор присваивания.

        System.out.println("Результат операции: " + x);

    }



}
