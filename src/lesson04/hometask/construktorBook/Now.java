package lesson04.hometask.construktorBook;

public class Now {

        String authors ;
        String titleBook;
        int numberPages;
        int numberKatalogs;
        boolean outLibriary;
        //большой Конструктор
        public Now (String authors, String titleBook, int numberPages, int numberKatalogs, boolean outLibriary) {
            this.authors = authors;
            this.titleBook = titleBook;
            this.numberPages = numberPages;
            this.numberKatalogs = numberKatalogs;
            this.outLibriary = outLibriary;
        }
        //маленький конструктор
        public Now(String authors, String titleBook){ //маленький
            this.authors = authors;
            this.titleBook = titleBook;
        }
}
