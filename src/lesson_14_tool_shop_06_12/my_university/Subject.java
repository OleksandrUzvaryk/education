package lesson_14_tool_shop_06_12.my_university;

public class Subject {

    String nameSubject;
    int amountOfHour;
    String secondNameTeacher;

    double costOfBooks;

    public Subject (String nameSubject, int amountOfHour, String secondNameTeacher, double costOfBooks){
        this.nameSubject = nameSubject;
        this.amountOfHour = amountOfHour;
        this.secondNameTeacher = secondNameTeacher;
        this.costOfBooks = costOfBooks;

    }

    public String getNameSubject() {
        return nameSubject;
    }

    public int getAmountOfHour() {
        return amountOfHour;
    }

    public String getSecondNameTeacher() {
        return secondNameTeacher;
    }

    public double getCostOfBooks() {
        return costOfBooks;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "nameSubject='" + nameSubject + '\'' +
                ", amountOfHour=" + amountOfHour +
                ", secondNameTeacher='" + secondNameTeacher + '\'' +
                ", costOfBooks=" + costOfBooks +
                '}';
    }
}
