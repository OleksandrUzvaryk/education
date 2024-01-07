package consultations.cons_05_book_kase_d_21_12.bookCase.service;

import consultations.cons_05_book_kase_d_21_12.bookCase.entiry.Book;
import consultations.cons_05_book_kase_d_21_12.bookCase.entiry.Bookcase;
import consultations.cons_05_book_kase_d_21_12.bookCase.entiry.Bookshelf;

public class PutBookOnShelf {


    public boolean putBookOnTheShelf(Book book, int numberOfShelf, Bookcase bookcase) {
        Bookshelf[] bookshelves = bookcase.getBookShelves();
        Bookshelf ourTargetShelf = bookshelves[numberOfShelf - 1];
        Book[] booksOnTheShelf = ourTargetShelf.getBooksOnShelf();

        Integer freePlace = findFreePlaceOnTheShelf(booksOnTheShelf);

        if (freePlace >= 0) {
            booksOnTheShelf[freePlace] = book;
            return true;
        } else {
            System.out.println("На полке нет свободного места для книги");
            return false;
        }
    }

    private Integer findFreePlaceOnTheShelf( Book[] booksOnTheShelf) {
        Integer quantityBooksOnTheShelf = booksOnTheShelf.length;
        for (int i = 0; i < quantityBooksOnTheShelf; i++) {
            if (booksOnTheShelf[i] == null) {
                return i;
            }
        }
        return -1;
    }


}
