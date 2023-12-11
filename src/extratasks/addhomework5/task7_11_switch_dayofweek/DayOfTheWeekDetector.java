package extratasks.addhomework5.task7_11_switch_dayofweek;

import java.util.Scanner;

public class DayOfTheWeekDetector {

    int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day beetwen 1 amd 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {

         switch (dayNumber) {
          case 1 : return "Monday";
          case 2 : return  "Tuesday";
          case 3 : return "Wednesday";
          case 4 : return "Thursday";
          case 5 : return "Friday";
          case 6 : return "Saturday";
          case 7 : return "Sunday";
          default : return "Not correct day number";

        }
    }
}
