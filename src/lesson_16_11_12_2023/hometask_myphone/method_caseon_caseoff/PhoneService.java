package lesson_16_11_12_2023.hometask_myphone.method_caseon_caseoff;

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

    // 6. Одеть чехол на телефон
    public boolean putTheCaseOn (Phone phone, Cases cases){
        if (cases.getNumber() !=0) {
            phone.setCases(cases);
            return true; }
        else {return false;}
    }

    // 7. Снять чехол с сохранением

    public Cases takeOffCase (Cases cases, Phone phone){
        Cases oldCase = phone.getCases();
        phone.setCases(null);
        return oldCase;

    }
}








