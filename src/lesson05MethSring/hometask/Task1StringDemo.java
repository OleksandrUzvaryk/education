package lesson05MethSring.hometask;

import lesson05MethSring.hometask.task1.TaskMethods;

public class Task1StringDemo {
    public static void main(String[] args)
    {
        String myPhrase = new String("I study Basic Java!");
        TaskMethods put = new TaskMethods();
        put.inputP(myPhrase);

        System.out.println(myPhrase.length());
        char symbol1 = myPhrase.charAt(18);
        System.out.println(myPhrase.charAt(18));

        boolean iFoundJava = myPhrase.contains("Java");
        System.out.println("В моей фразе есть слово - Java: " + iFoundJava);

        String changeText = myPhrase.replaceAll("a", "o");
        System.out.println(changeText);

        String bigChar = myPhrase.toUpperCase();
        System.out.println(myPhrase.toUpperCase());

        String littleChar = myPhrase.toLowerCase();
        System.out.println(myPhrase.toLowerCase());

        String cutJava = myPhrase.substring(7,15);
        System.out.println(cutJava);

    }
}

