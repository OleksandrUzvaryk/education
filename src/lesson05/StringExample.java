package lesson05;

public class StringExample {
    public static void main(String[] args) {

        String text1 = "This is string text example";
        String text2 = "This is string text example";
        System.out.println(text1.equals(text2));
        String text3 = new String("This is string text example");
        System.out.println(text1==text3);


        System.out.println("=========== сравнение через знак '==========");

    }
}
