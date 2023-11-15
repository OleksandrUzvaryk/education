package lesson04.hometask.construktorBook;

public class KonstruktorBook {
    String authors ;
    String titleBook;
    int numberPages;
    int numberKatalogs;
    boolean outLibriary;
    public KonstruktorBook(){
    }
    public KonstruktorBook(String authors, String titleBook){
        this.authors = authors;
        this.titleBook = titleBook;
    }
    public KonstruktorBook(String authors, String titleBook,  int numberPages, int numberKatalogs, boolean outLibriary){
        this.authors = authors;
        this.titleBook = titleBook;
        this.numberPages = numberPages;
        this.numberKatalogs = numberKatalogs;
        this.outLibriary = outLibriary;
    }

    public void allParameters(int numberPage,int numberKat, boolean inLib){
        System.out.println("2.Number of pages - " + numberPage);
        System.out.println("3.Katalog №" + numberKat);
        System.out.println("4.In liabrary - " + inLib);
    }
}

