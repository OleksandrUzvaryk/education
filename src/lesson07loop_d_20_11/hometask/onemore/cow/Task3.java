package lesson07loop_d_20_11.hometask.onemore.cow;

public class Task3 {

    public String cowMethod (int number){
        String phrase = "";
        if (number<1 || number>10){
            phrase = "Wrong number!!!";}
        else if (number == 1){phrase = "На лугу пасется " + number + " корова";}
        else if (number>= 2 && number<5){phrase = "На лугу пасется " + number + " коровы";}
        else {phrase = "На лугу пасется " + number + " коров";}
        return phrase;

    }
}
