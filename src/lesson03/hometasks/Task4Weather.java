package lesson03.hometasks;

public class Task4Weather {

    public static void main(String[] args) {

    String mon = "Понедельник";
    String tue = "Вторник";
    String wed = "Среда";
    String thu = "Четверг";
    String fri = "Пятница";
    String sut = "Суббота";
    String sun = "Воскресенье";
    int monT = 7;
    int tueT = 11;
    int wedT = 9;
    int thuT = 10;
    int friT = 14;
    int sutT = 8;
    int sunT = 9;

    double averageTemperature = (double)(monT + tueT + wedT + thuT + friT + sutT + sunT) / 7;
        System.out.println(averageTemperature);

        // через метод!!! в классі стоврити перемінні під кожен день


}

}
