package lesson04Meth.hometask.construktorBook;

public class KonstruktorBookDemo {
    public static void main(String[] args) {

    KonstruktorBook book1 = new KonstruktorBook("Mario Puzo","The Godfather",356,45,false);
        System.out.println(book1);

    KonstruktorBook book2 = new KonstruktorBook("George Orwell", "1984");
        System.out.println(book2);

        BookUtil util = new BookUtil();
        util.editBookCatalogNumber(7845,book2);
        util.editBookPageNumber(456,book2);
        util.editBookPlace(true,book2);

        System.out.println(book2);
        System.out.println(book1);

        System.out.println("====================");

        KonstruktorBook book3 = book1;// не работает, не создается ноый обьект а копируется ссылка 1 обьекта
        System.out.println(book3);

        book3.titleBook = "{hty";
        System.out.println(book3);

        System.out.println("====================");
        System.out.println(book1);

        // как работает наш метод копирования

        util.copyBook(book2);
        KonstruktorBook book4 = util.copyBook(book2);
        System.out.println(book4);
        System.out.println(book2);

        // другой альтернативный способ копирования

        KonstruktorBook book5 = new KonstruktorBook("copy" + book3.authors,book3.titleBook,book3.numberPages,book3.numberKatalogs,book3.outLibriary);
        util.editBookPageNumber(1455555,book5);
        System.out.println(book5);

    }
}