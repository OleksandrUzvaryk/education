package lesson05methstring_d_15_11.methods;

public class WorkWithString3 {
    public static void main(String[] args) {

        String text = "  Это текст для проверки работы методов типа String  ";
        System.out.println(text);
        System.out.println("===== убрать пробелы с начала и конца текста  =====");

        //  убрать пробелы с начала и конца текста
        text = text.trim();
        System.out.println(text);

        // поиск номера индекса символа
        System.out.println(text.indexOf("метод"));


        // замена символа на символ
        String replaceText = (text.replaceAll("о", "a"));
        System.out.println(replaceText);













    }
}
