package lesson_16_11_d_12_2023_phone.hometask_myphone_sim_2string;

public class PhoneService {


    // 1. Вставить симку
    public boolean insertSimCard(Phone phone, SimCard simCard) {   // передаем в метод отедльно клас симкард и телефон, что бы делать все удаленно
        if (simCard.getNumber() != 0) {   // если переменная симкард через геттер достает ссылку на номер, и она не равен нулю
            phone.setSimCard(simCard);   // тогда через переменную телефон, вызываем сеттер и передаем туда аргумент метода в виде переменной симкард
            return true;                    // возвращаем тру
        } else {
            return false;
        }
    }

    public boolean insertSimCard2(Phone phone, SimCard simCardTwo) {
        if (simCardTwo.getNumber() != 0) {
            phone.setSimCardTwo(simCardTwo);
            return true;
        } else {
            return false;
        }
    }

    //2. удалить симку
    public SimCard removeSimCard(Phone phone) {      // метод возвратит переменную класа Симкард (ту симку которую мы вытащили), вызываем клас телефон, берез конкретный екземпляр
        SimCard removeSimCard = phone.getSimCard(); // создаем переменную класа Симкард, и вытаскиваем туда номер текущей симки в телефоне
        phone.setSimCard(null);                     // через сет запсываем  в конкретный телефон значение симки -пусто
        return removeSimCard;                       // возвращаем номер старой симки через новую переменную в клас Симкард
    }

    public SimCard removeSimCard2(Phone phone) {
        SimCard removeSimCard2 = phone.getSimCardTwo();
        phone.setSimCardTwo(null);
        return removeSimCard2;
    }


    // 3. Заменить симку с сохранением номера
    public SimCard changeSimCard(Phone phone, SimCard newSimCard) { // изменения затрагивают и сим и телефон  - по тому вызываем переменные их классов
        SimCard removeSimCard = phone.getSimCard();  // из обьекта телефон, из гет Сим карт вытаскиваем ссылку на нашу конкретную симку
        int oldNumber = removeSimCard.getNumber();// в новую переменную вытаскиваем старый номер
        newSimCard.setNumber(oldNumber); // новой симке вписываем номер старой смики
        phone.setSimCard(newSimCard);  //  в телефон вставляем новую симку
        removeSimCard.setNumber(0);  // старой симке в номер пердаем 0
        return removeSimCard;  // возвращаем старую симку без номера
    }

    public SimCard changeSimCard2(Phone phone, SimCard newSimCard2) {
        SimCard removeSimCard2 = phone.getSimCardTwo();
        int oldNumberTwo = removeSimCard2.getNumber();
        newSimCard2.setNumber(oldNumberTwo);
        phone.setSimCardTwo(newSimCard2);
        removeSimCard2.setNumber(0);
        return removeSimCard2;
    }


    //4. Получить/принять смс
    public boolean receivedSms(Phone phone, String message) { // создаем внутренний массив, туда ложим ссылку на массив наших смс
        String[] ourSmsMessage = phone.getSimCard().getSms(); // создаем переменную - ее значение есть результат поиска в нашем массив е свободного места
        int emptySell = firstEmptyCell(ourSmsMessage);
        if (emptySell == -1) {
            System.out.println("You haven't memory, please delete previous sms!");
            return false;
        } else {
            ourSmsMessage[emptySell] = message;
            return true;
        }   // если место нашлось - записываем входящее сообщение
    }

    public boolean receivedSms2(Phone phone, String message) {
        String[] ourSmsMessage2 = phone.getSimCardTwo().getSms();
        int emptySell = firstEmptyCell(ourSmsMessage2);
        if (emptySell == -1) {
            System.out.println("You haven't memory, please delete previous sms!");
            return false;
        } else {
            ourSmsMessage2[emptySell] = message;
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
    public boolean deleteSmsMessageSim1(Phone phone, int smsNumber) { // вызывает клас телефон, через него и гетеры передаем в конкретный индекс массива  ноль
        if (smsNumber >= 0 && smsNumber < 10) {
            phone.getSimCard().getSms()[smsNumber] = null;
            return true;
        } else {
            System.out.println("Message with that number not exist ");
            return false;
        }
    }

    public boolean deleteSmsMessageSim2(Phone phone, int smsNumber) {
        if (smsNumber >= 0 && smsNumber < 10) {
            phone.getSimCardTwo().getSms()[smsNumber] = null;
            return true;
        } else {
            System.out.println("Message with that number not exist ");
            return false;
        }
    }

    // 6. удалить весь массив смс
    public boolean deleteAllMessagesSim1(Phone phone) {
        String[] newSmsMessages = new String[10];
        phone.getSimCard().setSms(newSmsMessages);
        return true;
    }

    public boolean deleteAllMessagesSim2(Phone phone) {
        String[] newSmsMessages = new String[10];
        phone.getSimCardTwo().setSms(newSmsMessages); // передаем вместо существующего массива - новый и пустой
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











