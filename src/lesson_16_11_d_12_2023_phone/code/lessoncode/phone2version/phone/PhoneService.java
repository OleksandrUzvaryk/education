package lesson_16_11_d_12_2023_phone.code.lessoncode.phone2version.phone;

public class PhoneService {

    /*
    1. Вставить симку
    2. удалить симку
    3. Заменить симку с сохранением номера
    4. Получить смс
    5. удалить какую-то смску

     */

    public boolean insertSimCard(Phone phone, SimCard simCard, int numberOfCell){
        if (simCard.getNumber() != 0) {
        phone.setOneSimCard(simCard, numberOfCell);
        return true;
        } else {
            return false;
        }
    }

    public SimCard removeSimCard(Phone phone, int numberOfCell) {
        SimCard[] simCards = phone.getSimCard();
        SimCard removedSimCard = simCards[numberOfCell];
        simCards[numberOfCell] = null;
        return removedSimCard;
    }

    public SimCard changeSimCard(Phone phone, SimCard newSimCard, int numberOfCell){
            SimCard[] simCards = phone.getSimCard();
            SimCard removedSimCard = simCards[numberOfCell];
            int oldNumber = removedSimCard.getNumber();
            newSimCard.setNumber(oldNumber);
            simCards[numberOfCell] = newSimCard;
            removedSimCard.setNumber(0);
            return removedSimCard;

    }

    public boolean receivedSms(Phone phone, String message, int numberOfCell){

        SimCard[] simCards = phone.getSimCard();
        SimCard workingSimCard = simCards[numberOfCell];
        String[] ourSmsMessages = workingSimCard.getSms();
        int emptyCell = firstEmptyCell(ourSmsMessages);
        if (emptyCell == -1) {
            System.out.println("Нет памяти для новой смс. Удалите прошлые сообщения!");
            return false;
        } else {
            ourSmsMessages[emptyCell] = message;
            return true;
        }
    }

    private int firstEmptyCell(String[] messages){
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean deleteSmsMessage(Phone phone, int smsNumber, int numberOfCell){
        if (smsNumber >= 0 && smsNumber < 10) {
        phone.getSimCard()[numberOfCell].getSms()[smsNumber] = null;
        return true;
        } else {
            System.out.println("Нет сообщения с таким номером!");
            return false;
        }
    }

    public boolean deleteAllMessages(Phone phone, int numberOfCell) {
        String[] newSmsMessages = new String[10];
        phone.getSimCard()[numberOfCell].setSms(newSmsMessages);
        return true;
    }

}
