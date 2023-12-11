package extratasks.addhomework5.task7_11_switch_dayofweek;

public class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {

        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector(); // вызываем клас в котором лежит наш метод
        int dayNumber = dayOfTheWeekDetector.getDayNumberFromUser();            // создаем переменную в которую ложим результат

        String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);







        }
    }

