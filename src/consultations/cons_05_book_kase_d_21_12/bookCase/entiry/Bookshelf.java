package consultations.cons_05_book_kase_d_21_12.bookCase.entiry;

import java.util.Arrays;

public class Bookshelf {
    private Integer id;
    private Book[] booksOnShelf;

    public Bookshelf(Integer id, Book[] booksOnShelf) {
        this.id = id;
        this.booksOnShelf = booksOnShelf;
    }

    public Book[] getBooksOnShelf() {
        return booksOnShelf;
    }


    @Override
    public String toString() {
        return "Bookshelf{" +
                "books=" + Arrays.toString(booksOnShelf) +
                '}';
    }
}
