package lesson05methstring.methods;

public class WorkWithString2 {
    public static void main(String[] args) {

        String text = "Это текст для проверки работы методов типа String";
        System.out.println(text);
        System.out.println("===== проверка вхождения текста в другую строку");

        String testString1 = "рабо";

        //  проверка вхождения текста в другую строку

        boolean resultCheckContains = text.contains(testString1);
        System.out.println("Contains word 'Str' result is - " + text.contains("str"));


        // Большой регистр

        String textAfterUpperCase = text.toUpperCase();
        System.out.println(textAfterUpperCase);

        // Большой регистр

        String textAfterLowerCase = text.toLowerCase();
        System.out.println(textAfterLowerCase);

        System.out.println("Contains word 'Str' result is - " + textAfterLowerCase.contains("str"));













    }
}
