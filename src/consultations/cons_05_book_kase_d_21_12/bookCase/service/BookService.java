package consultations.cons_05_book_kase_d_21_12.bookCase.service;

import consultations.cons_05_book_kase_d_21_12.bookCase.entiry.Book;
import consultations.cons_05_book_kase_d_21_12.bookCase.entiry.BooksCollections;
import consultations.cons_05_book_kase_d_21_12.bookCase.service.utils.UserInput;

public class BookService {
    UserInput ui = new UserInput();
    private int totalNumberOfBooks;

    public BookService(int totalNumberOfBooks) {
        this.totalNumberOfBooks = totalNumberOfBooks;
    }

    private Book createBook(){

        int bookId = ui.userInputInt("insert book id:");
        String bookAuthor = ui.userInputText("insert book author: ");
        String bookName = ui.userInputText("insert book name:");
        Book book = new Book(bookId,bookAuthor,bookName);
        return book;
    }
    private BooksCollections createBooksArray(){
        BooksCollections booksCollections = new BooksCollections(totalNumberOfBooks);
        return booksCollections;
    }

    public BooksCollections fillBooksArrayFromUser(){
        BooksCollections booksCollections = createBooksArray();

        for (int i = 0; i < totalNumberOfBooks; i++) {
            booksCollections.getBooksCollections()[i] = createBook();
        }
        return booksCollections;
    }

}
