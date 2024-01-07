package consultations.cons_04_book_kase_d_14_12.service;

import consultations.cons_04_book_kase_d_14_12.entiry.Book;
import consultations.cons_04_book_kase_d_14_12.entiry.Books;


public class BookService {

    UserInput ui = new UserInput();
    private int totalNumberOfBooks;

    public BookService(int totalNumberOfBooks) {
        this.totalNumberOfBooks = totalNumberOfBooks;
    }

    private Book createBook(){

        int bookId = ui.userInterfaceInputInt("insert book id:");
        String bookAuthor = ui.userInterfaceInputText("insert book author: ");
        String bookName = ui.userInterfaceInputText("insert book name:");
        Book book = new Book(bookId,bookAuthor,bookName);
        return book;
    }
    private Books createBooksArray(){
        Books books = new Books(totalNumberOfBooks);
        return books;
    }

    public  Books fillBooksArrayFromUser(){
        Books books = createBooksArray();

        for (int i = 0; i < books.getBooks().length; i++) {
            books.getBooks()[i] = createBook();
        }
        return books;
    }

}
