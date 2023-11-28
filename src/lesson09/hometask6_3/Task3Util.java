package lesson09.hometask6_3;

public class Task3Util {

    public String fromSecToText(int seconds) {

        int hours = seconds / 3600;

        String secToText = " до конца работы осталось " + hours + " часов"; // 8 -5 час

        if (hours < 5) {secToText = " до конца работы осталось " + hours + " часа";} // 4-2 часа
        if (hours == 1) {secToText = " до конца работы остался 1 час";}
        if (hours < 1) {secToText = " до конца работы осталось менее часа";}

        return secToText;

        }
}
