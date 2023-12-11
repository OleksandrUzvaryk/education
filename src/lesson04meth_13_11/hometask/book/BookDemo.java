package lesson04meth_13_11.hometask.book;
public class BookDemo {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\tWelcome to our libriary!!!");

        Book book1 = new Book();
        book1.findBook("George Orwel", "1984");
        book1.allParameters(256,13,true);

        Book book2 = new Book();
        book2.findBook("Johnatan Livingston","Seagull");
        book2.allParameters(187,69,false);

        System.out.println();

        Book book3 = new Book();
        book3.findBook2("Ernest Hemingway", "For Whom the Bell Tolls",474, 74, true);
        Book book4 = new Book();
        book4.findBook2("Erich Maria Remarque", "All Quiet on the Western Front",351, 755, true);

        //int addNumberPages = book1.inputPage(346);
        //int addNumberKatalog = book1.inputKatalog(56);
        //boolean findPlace = book1.inputPlace(true);
        // System.out.println(addNumberPages);
        // System.out.println(addNumberKatalog);
        // System.out.println(findPlace);
        //addNumberPages = book2.inputPage(256);
        //addNumberKatalog = book2.inputKatalog(12);
        //findPlace = book2.inputPlace(false);
        // System.out.println(addNumberPages);
        // System.out.println(addNumberKatalog);
        //System.out.println(findPlace);

    }
}



