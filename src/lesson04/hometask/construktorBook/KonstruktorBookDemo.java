package lesson04.hometask.construktorBook;

public class KonstruktorBookDemo {
    public static void main(String[] args) {

    KonstruktorBook book = new KonstruktorBook();
    KonstruktorBook book1 = new KonstruktorBook("Mario Puzo", "The Godfather");
    KonstruktorBook book2 = new KonstruktorBook("George Orwel", "1984");

        System.out.println("\t\t\t\t\t\'Book: " + book1.titleBook + "\n1.Writer: " + book1.authors );
        book1.allParameters(376,7,true);
        System.out.println("\t\t\t\t\t\'Book: " + book2.titleBook + "\nWriter: " + book2.authors );
        book2.allParameters(456,121,false);
        System.out.println();

    KonstruktorBook book3 = new KonstruktorBook("Johnatan Livingston","Seagull",214,56,true);
    KonstruktorBook book4 = new KonstruktorBook("Ernest Hemingway","For Whom the Bell Tolls",624,6,false);
        System.out.println("\t\t\t\t\t\'Book: " + book3.titleBook + "\n1.Writer: " + book3.authors + "\n2.Number of pages -" + book3.numberPages + "\nNumber in katalog № " + book3.numberKatalogs + "\n4.In libriary - " + book3.outLibriary  );
        System.out.println("\t\t\t\t\t\'Book: " + book4.titleBook + "\n1.Writer: " + book4.authors + "\n2.Number of pages - " + book4.numberPages + "\n3.Katalog №" + book4.numberKatalogs + "\n4.In libriary - " + book4.outLibriary );
    }
}

