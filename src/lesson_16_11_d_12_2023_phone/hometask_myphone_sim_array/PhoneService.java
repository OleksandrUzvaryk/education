package lesson_16_11_d_12_2023_phone.hometask_myphone_sim_array;

public class PhoneService {


    // 1. Вставить симку
    public boolean insertSimCard(Phone phone, SimCard simCards, int numberOfCell) { // вызываем класс телефон, симкарт, и указываем конкретную ячейку симкм
        if (simCards.getNumber() != 0) {   // через клас симкарт- проверяем наличие номера
            phone.setOneSimCard(simCards, numberOfCell);   // через клас телефон, вызываем метод - присваивая конкретную симку в массив карточек
            return true;                    //
        } else {
            return false;
        }
    }


    //2. удалить симку
    public SimCard removeSimCard(Phone phone, int numberOfCell) {     //указываем номер конкретной симки из массива симок
        SimCard[] simCards = phone.getSimCard(); // вытаскиваем ссылку на массив симок
        SimCard removeSimCard = simCards[numberOfCell]; // через массив симок обращаемся к конкретной симке - сохраняя ее в переменную
        simCards[numberOfCell] = null;                 // на ее место посылаем нул
        return removeSimCard;                       // возвращаем номер старой симки через новую переменную в клас Симкард
    }


    // 3. Заменить симку с сохранением номера
    public SimCard changeSimCard(Phone phone, SimCard newSimCard, int numberOfCell) { //
        SimCard[] simCards = phone.getSimCard(); // вытаскиваем ссылку на массив симок
        SimCard removeSimCard = simCards[numberOfCell];  //  через массив симок обращаемся к конкретной симке - сохраняя ее в переменную
        int oldNumber = removeSimCard.getNumber();// через переменную, которая имееб ссылку на конкретную симку, вытаскиваем номер симки
        newSimCard.setNumber(oldNumber); // сохраняем в значение новой симки старый номер
        simCards[numberOfCell] = newSimCard;  // в массив симок - на место старой симки ставим ноыую
        removeSimCard.setNumber(0);  // старой симке в номер пердаем 0
        return removeSimCard;  // возвращаем старую симку без номера
    }


    //4. Получить/принять смс
    public boolean receivedSms(Phone phone, String message, int numberOfCell) { //
        SimCard[] simCards = phone.getSimCard();  // вытаскиваем ссылку на масив симок
        SimCard workingSimCard = simCards[numberOfCell]; // обращаемя к конкретной симке - привязав ее к переменной
        String[] ourSmsMessage = workingSimCard.getSms(); // создаем внут массив куда передаем массив из смс выбраной ранее симки
        int emptySell = firstEmptyCell(ourSmsMessage); // через метод ищем наличие свободного места в памяти
        if (emptySell == -1) {
            System.out.println("You haven't memory, please delete previous sms!");
            return false;
        } else {
            ourSmsMessage[emptySell] = message;
            return true;
        }   // если место нашлось - записываем входящее сообщение
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
    public boolean deleteSmsMessageSim(Phone phone, int smsNumber, int numberOfCell) { //
        if (smsNumber >= 0 && smsNumber < 10) {
            phone.getSimCard()[numberOfCell].getSms()[smsNumber] = null; // через класс телефон вытаскиваем конкретное сообщение из ее масива смс
            return true;
        } else {
            System.out.println("Message with that number not exist ");
            return false;
        }
    }


    // 6. удалить весь массив смс
    public boolean deleteAllMessagesSim(Phone phone, int numberOfCell) {
        String[] newSmsMessages = new String[10];
        phone.getSimCard()[numberOfCell].setSms(newSmsMessages); // создаем пустой массив, через геттер выбираем конкретную сим,
        // а сеттером - отправляем ссылку на пустой массив
        return true;
    }


    // 7.Метод одеть чехол

    public boolean caseOn(Phone phone, Cases cases) {
        if (cases.getNumber() != 0) {
            phone.setCases(cases);
            return true;
        } else {
            return false;
        }
    }

    // 8. Метод снять чехол
    public Cases caseOff(Phone phone, Cases cases) {
        Cases oldCase = phone.getCases();
        phone.setCases(null);
        return oldCase;
    }

}











