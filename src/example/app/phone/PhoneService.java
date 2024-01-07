package example.app.phone;

public class PhoneService {
    // 1. Вставить симку
    public boolean insertSimCard(SimCard simCard, Phone phone, int numberOfCell) {
        if (simCard.getNumber() != 0) {
            phone.setOneSimCard(simCard,numberOfCell);
            return true;
        } else {
            return false;
        }
    }

    //2. удалить симку

    public SimCard removeSimCard(Phone phone, int numberOfCell) {
        SimCard[] simCards = phone.getSimCards();
        SimCard removeSimCard = simCards[numberOfCell];
        simCards[numberOfCell] = null;
        return removeSimCard;
    }

    // 3. Заменить симку с сохранением номера

    public SimCard changeSimCard(SimCard newsimcard, Phone phone, int numberOfCell) {
        SimCard[] simCards = phone.getSimCards();
        SimCard removeSimCard = simCards[numberOfCell];
        int oldNumber = removeSimCard.getNumber();
        newsimcard.setNumber(oldNumber);
        simCards[numberOfCell] = newsimcard;
        removeSimCard.setNumber(0);
        return removeSimCard;
    }

    //4. Получить/принять смс

    public boolean recievedSms(Phone phone, String message, int numberOfCell) {
        SimCard[] simCards = phone.getSimCards();
        SimCard workingSim = simCards[numberOfCell];
        String[] ourSms = workingSim.getSms();
        int emptySell = firstEmptyCell(ourSms);
        if (emptySell == -1) {
            System.out.println("You haven't memory, please delete previous sms!");
            return false;
        } else {
            ourSms[emptySell] = message;
            return true;
        }
    }

    public int firstEmptyCell(String[] message) {
        for (int i = 0; i < message.length; i++) {
            if (message[i] == null) {
                return i;
            }
        }
        return -1;
    }

    // 5. удалить какую-то смску

    public boolean deleteOneMessage(Phone phone, int smsNumber, int numberOfCell) {
        if (smsNumber >= 0 && smsNumber < 10) {
            phone.getSimCards()[numberOfCell].getSms()[smsNumber] = null;
            return true;
        } else {
            System.out.println("Message with that number not exist ");
            return false;
        }

    }

    // 6. удалить весь массив смс
    public boolean deleteAllMesages(Phone phone, int numberOfCell) {
        String[] newSmsMessages = new String[10];
        phone.getSimCards()[numberOfCell].setSms(newSmsMessages);
        return true;
    }

    // 7.Метод одеть чехол

    public boolean caseOn(Phone phone, Case cases) {
        if (cases.getNumber() != 0) {
            phone.setCases(cases);
            return true;
        } else {
            return false;
        }
    }

    // 8. Метод снять чехол

    public Case caseOff(Phone phone, Case cases) {
        Case oldCase = phone.getCases();
        phone.setCases(null);
        return oldCase;
    }

}

