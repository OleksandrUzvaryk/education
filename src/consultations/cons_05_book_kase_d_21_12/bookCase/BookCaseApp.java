package consultations.cons_05_book_kase_d_21_12.bookCase;

import consultations.cons_05_book_kase_d_21_12.bookCase.entiry.Bookcase;
import consultations.cons_05_book_kase_d_21_12.bookCase.entiry.BooksCollections;
import consultations.cons_05_book_kase_d_21_12.bookCase.service.BookCaseService;
import consultations.cons_05_book_kase_d_21_12.bookCase.service.BookInput;
import consultations.cons_05_book_kase_d_21_12.bookCase.service.utils.PrintData;

public class BookCaseApp {
    public static void main(String[] args) {
        PrintData printData = new PrintData();
        BookInput bookInput = new BookInput(12);
        BooksCollections booksCollections = bookInput.inputBooksFromArray();
        printData.printBookCollections(booksCollections);

        // имеем bookCollections в котором хранятся все наши книги

        BookCaseService bookCaseService = new BookCaseService();

        Bookcase bc = bookCaseService.createBookCase(3,4);

        // создан книжный шкаф в котором 3 полки на 4 книги на каждой полке, но они пустые
        // будем заполнять наши полки



        printData.printBC(bc);

    }
}
