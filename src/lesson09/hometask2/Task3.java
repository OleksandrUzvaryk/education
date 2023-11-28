package lesson09.hometask2;


//Дано трехзначное число (произвольное). Создать три переменные в которые
// с помощью математических действий присвоить цифры этого числа
// Вывести на экран все переменные (не напечатать цифры,
// а именно получить значения переменных).
//Пример: 345 Вывод в консоль: Число 345 -> 3, 4, 5


public class Task3 {

    public static void main(String[] args) {

        int number = 345;
        // 1 variant
        int digit1 = number % 10;
        System.out.println(digit1);

        int digit2 = number % 100 / 10;
        System.out.println(digit2);

        int digit3 = number / 100;
        System.out.println(digit3);

        // 2 variant
        String numberStr  = String.valueOf(number);
        System.out.println(numberStr);
        System.out.println("First number is: " + numberStr.charAt(0));
        System.out.println("First number is: " + numberStr.charAt(1));
        System.out.println("First number is: " + numberStr.charAt(2));


    }



}
