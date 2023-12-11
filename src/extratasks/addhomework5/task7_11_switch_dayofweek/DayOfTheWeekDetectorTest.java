package extratasks.addhomework5.task7_11_switch_dayofweek;

public class DayOfTheWeekDetectorTest {


    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
        test.shouldReturnWrong();
    }

    public void shouldReturnMonday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
    }

    public void shouldReturnTuesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(2);
        checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday");
    }

    public void shouldReturnWednesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(3);
        checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday");
    }

    public void shouldReturnThursday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(4);
        checkTestResult("Thursday".equals(dayOfTheWeek), "Thursday");
    }

    public void shouldReturnFriday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(5);
        checkTestResult("Friday".equals(dayOfTheWeek), "Friday");
    }

    public void shouldReturnSaturday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
    }

    public void shouldReturnSunday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(7);
        checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");
    }

    public void shouldReturnWrong() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(8);
        checkTestResult("Not correct day number".equals(dayOfTheWeek), "Not correct day number");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }















        /* int day1 = 1;
        String expectResult1 = "Monday";
        String  actualResult1 = check.findDayOfTheWeek(day1);
        System.out.println(actualResult1);
        if (expectResult1.equals(actualResult1)){System.out.println("Test is passed, real day of the week!!!");}
        else {System.out.println("Test  is failed!!!");}

        int day2 = 2;
        String expectResult2 = "Tuesday";
        String  actualResult2 = check.findDayOfTheWeek(day2);
        System.out.println(actualResult2);
        if (expectResult2.equals(actualResult2)){System.out.println("Test is passed, real day of the week!!!");}
        else {System.out.println("Test  is failed!!!");}


        int day3 = 3;
        String expectResult3 = "Wednesday";
        String  actualResult3 = check.findDayOfTheWeek(day3);
        System.out.println(actualResult3);
        if (expectResult3.equals(actualResult3)){System.out.println("Test is passed, real day of the week!!!");}
        else {System.out.println("Test  is failed!!!");}


        int day4 = 4;
        String expectResult4 = "Thursday";
        String  actualResult4 = check.findDayOfTheWeek(day4);
        System.out.println(actualResult4);
        if (expectResult4.equals(actualResult4)){System.out.println("Test is passed, real day of the week!!!");}
        else {System.out.println("Test  is failed!!!");}


        int day5 = 5;
        String expectResult5 = "Friday";
        String  actualResult5 = check.findDayOfTheWeek(day5);
        System.out.println(actualResult5);
        if (expectResult5.equals(actualResult5)){System.out.println("Test is passed, real day of the week!!!");}
        else {System.out.println("Test  is failed!!!");}



        int day6 = 6;
        String expectResult6 = "Saturday";
        String  actualResult6 = check.findDayOfTheWeek(day6);
        System.out.println(actualResult6);
        if (expectResult6.equals(actualResult6)){System.out.println("Test is passed, real day of the week!!!");}
        else {System.out.println("Test  is failed!!!");}


        int day7 = 7;
        String expectResult7 = "Sunday";
        String  actualResult7 = check.findDayOfTheWeek(day7);
        System.out.println(actualResult7);
        if (expectResult7.equals(actualResult7)){System.out.println("Test is passed, real day of the week!!!");}
        else {System.out.println("Test  is failed!!!");}*/

       /* int day8Test = 22;
        String expectResult8 = "Not correct day number";
        String  actualResult8 = check.findDayOfTheWeek(day8Test);
        System.out.println(actualResult8);
        if (expectResult8.equals(actualResult8)){System.out.println("Test is passed, real day of the week!!!");}
        else {System.out.println("Test  is failed!!!");}*/


    }

