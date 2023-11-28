package lesson04Meth.hometask.construktorBook;

public class BookUtil {
    public void editBookCatalogNumber(int numberKatalogs, KonstruktorBook book){
        book.numberKatalogs = numberKatalogs;
    }
    public void editBookPageNumber (int numberPages, KonstruktorBook book){
        book.numberPages = numberPages;

    }
    public void editBookPlace(boolean outLibriary,KonstruktorBook book){
        book.outLibriary = outLibriary;
    }

    public KonstruktorBook copyBook(KonstruktorBook book){
        KonstruktorBook copyBook = new KonstruktorBook(book.authors, book.titleBook + " copy ", book.numberPages, book.numberKatalogs, book.outLibriary);
    return copyBook;
    }

}
