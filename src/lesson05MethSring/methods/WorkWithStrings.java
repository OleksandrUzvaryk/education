package lesson05MethSring.methods;

public class WorkWithStrings {

    public static void main(String[] args) {


        String str1 = "  ";
        String text = "Это текст для проверки работы методов типа String";
        String text1 ="";

        // поиск длины строки - amount of characters numbers
        System.out.println(str1.length());

        // особенность Стринговых переменных - возможность просчитать
        // количества символов в переменной
        int myTextLength = text.length();
        System.out.println(myTextLength);

        // проверка строки на наличие символов
        boolean isMyStringEmpty = str1.isEmpty();
        System.out.println(isMyStringEmpty);

        boolean isMyText1Empty = text1.isEmpty();
        System.out.println(isMyText1Empty);

        // проверка строки на наличие символов кроме пробелов

        boolean isMyStringBlank = str1.isBlank();
        System.out.println(isMyStringEmpty);

        boolean isMyText1Blank = text1.isBlank();
        System.out.println(isMyText1Empty);




    }
}
