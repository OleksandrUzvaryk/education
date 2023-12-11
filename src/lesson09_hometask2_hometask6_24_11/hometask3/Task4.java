package lesson09_hometask2_hometask6_24_11.hometask3;

public class Task4 {
// Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю. Вычислите среднюю температуру за неделю и выведете ее на печать.
    public static void main(String[] args) {

        double tempMonday = 19.3;
        double tempTuesday = 20.4;
        double tempWednesday = 30.8;
        double tempThursday = 18.4;
        double tempFriday = 20.0;
        double tempMSaturday = 24.6;
        double tempSunday = 25.4;

        Task4Util task4Util = new Task4Util();
       //task4Util.averageTemp() - переменная ссылочного типа task4Util  которая вызвала метод  averageTemp и вернула
        // результат в task4Util.averageTemp
        System.out.println("Average temp: "
        + task4Util.averageTemp(
                tempMonday,
                tempTuesday,
                tempWednesday,
                tempThursday,
                tempFriday,
                tempFriday,
                tempMSaturday,
                tempSunday
        ));
    }
}
