package lesson04meth_d_13_11.hometask.construktorBook;

public class KonstruktorBook {
    String authors ;
    String titleBook;
    int numberPages;
    int numberKatalogs;
    boolean outLibriary;

    public KonstruktorBook(String authors, String titleBook,  int numberPages, int numberKatalogs, boolean outLibriary) {
        this.authors = authors;
        this.titleBook = titleBook;
        this.numberPages = numberPages;
        this.numberKatalogs = numberKatalogs;
        this.outLibriary = outLibriary;
    }

    public KonstruktorBook(String authors, String titleBook){
        this.authors = authors;
        this.titleBook = titleBook;
    }

    @Override
    public String toString() {  //возможно редактировать по собственному желанию
        return "KonstruktorBook{" +
                "authors='" + authors + '\'' +
                ", titleBook='" + titleBook + '\'' +
                ", numberPages=" + numberPages +
                ", numberKatalogs=" + numberKatalogs +
                ", outLibriary=" + outLibriary +
               '}';
    }
}

