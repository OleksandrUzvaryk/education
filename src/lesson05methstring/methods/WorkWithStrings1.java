package lesson05methstring.methods;

public class WorkWithStrings1 {

    public static void main(String[] args) {

        String text = "Это текст для проверки работы методов типа String";
        System.out.println(text);

        // узнать какой символ? начало индекса с 0
        char symbol1 = text.charAt(0);
        System.out.println(text.charAt(0));

        System.out.println(text.charAt(14));
        System.out.println(text.charAt(10));
        System.out.println(text.charAt(48));
        //System.out.println(text.charAt(49)) - ошибка в связи с длиной в 49 символов, а индекс от 0-48

        //вирезать кусок строки из текста - подстрока
        //вирезать кусок строки из текста - подстрока от одного индекса до другого
        //вирезать кусок строки из текста - подстрока от одного индекса до конца строки

        System.out.println("вирезать кусок строки из текста - подстрока");
        System.out.println("вирезать кусок строки из текста - подстрока от одного индекса до другого");
        System.out.println("вирезать кусок строки из текста - подстрока от одного индекса до конца строки");

        String substringText1 = text.substring(40);
        String substringText2 = text.substring(0,12);
        String substringText3 = text.substring(0,49);

        System.out.println(substringText1);
        System.out.println(substringText2);
        System.out.println(substringText3);

        System.out.println(substringText2 + "->" + substringText1); // контентенация строк








    }
}
