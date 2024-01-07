package lesson05methstring_d_15_11.hometask.oneMore.task1;

public class Make_String_Demo {
    public static void main(String[] args) {

        String string = new String("I study Basic Java!");
        Make_String service = new Make_String();
        service.printString(string);

        int length = string.length();
        System.out.println("Phrase length is => " + length);
        System.out.println(string.charAt(18));

        boolean findWord = string.contains("Java");
        System.out.println(findWord);

        System.out.println(string.replaceAll("a", "o"));

        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());

        String cutString = string.substring(0,14);
        System.out.println(cutString);

    }
}
