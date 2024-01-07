package lesson06Ifelse_d_17_11.hometask.onemore.task3;

public class Clock {

    public String checkTime (int leftSec){

        int time = leftSec/3600;
        String message;

        if (time >4){message = "до конца рабочего дня осталось " + time + "часов";}
        else if (time <=4 && time >1){ message = "до конца рабочего дня осталось " + time + "часа";}
        else if(time ==1){message = "до конца рабочего дня осталось " + time + "час";}
        else {message = "до конца рабочего дня осталось менее  " + time + "часа";}
        return message;

    }

}
