package lesson04meth.hometask.book;

public class Book {
    String writer;
    String nameBook;
    int numberPage;
    int numberKat;
    boolean inLib;

    public void findBook(String writer, String nameBook) {
        System.out.println("\t\t\t\t\t\'Book: " + "\"" + nameBook + "\"" + "\n1.Writer: " + writer);
    }
    public void findBook2(String writer, String nameBook, int numberPage, int numberKat, boolean inLib) {
        System.out.println("\t\t\t\t\t\'Book: " + "\"" + nameBook + "\"" + "\n1.Writer: " + writer + "\n2.Number of pages - " + numberPage +
                "\n3.Katalog №" + numberKat + "\n4.In liabrary - " + inLib);
    }
    public void allParameters(int numberPage,int numberKat, boolean inLib){
        System.out.println("2.Number of pages - " + numberPage);
        System.out.println("3.Katalog №" + numberKat);
        System.out.println("4.In liabrary - " + inLib);
    }
    public int inputPage(int numberPage) {
        int result = numberPage;
        return result;
    }
    public int inputKatalog(int numberKat) {
        int result = numberKat;
        return result;
    }
    public boolean inputPlace(boolean inLib) {
        boolean result = inLib;
        return result;
    }

}

