package lesson_19.messanger;

public class Ph {

    //Messenger [] myMes = {new Telegram(), new Viber(), new WhatsAp()};

    Messenger [] myMes;

    public Ph(Messenger[] myMes) {
        this.myMes = myMes;
    }

    public Messenger[] getMyMes() {
        return myMes;
    }
}
