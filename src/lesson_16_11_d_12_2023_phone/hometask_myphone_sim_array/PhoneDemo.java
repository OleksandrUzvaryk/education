package lesson_16_11_d_12_2023_phone.hometask_myphone_sim_array;

import java.util.Arrays;

public class PhoneDemo {

    public static void main(String[] args) {

        PhoneService phoneService = new PhoneService();
        Phone phone = new Phone(2443434, "Gert2");
        SimCard simCard1 = new SimCard(111111111);
        SimCard simCard2 = new SimCard(222222222);
        SimCard simCardForSecondSlot1 = new SimCard(9999);
        SimCard simCardForSecondSlot2 = new SimCard(7777);
        Cases myCase = new Cases(50, "Red", "Leather");
        Cases myCase2 = new Cases(20, "Black", "Titan");
        System.out.println("_______________________________________________________________________________");

        // Метод - вставить simCard
        System.out.println("\nМетод - вставить simCard  в 1 слот: ");
        boolean inserted = phoneService.insertSimCard(phone, simCard1, 0);
        if (inserted) {
            System.out.println("Sim 1 inserted in => " + phone);
        } else {
            System.out.println("Error !!! ");
        }
        System.out.println("\n");
        System.out.println("Телефон с simCard1 : \n" + phone);
        System.out.println("\n");
        System.out.println("_______________________________________________________________________________");
        System.out.println("\nМетод - вставить simCard во 2 слот: ");
        inserted = phoneService.insertSimCard(phone, simCardForSecondSlot1, 1);
        if (inserted) {
            System.out.println("Sim 2 inserted in => " + phone);
        } else {
            System.out.println("Error !!! ");
        }
        System.out.println("\n");
        System.out.println("Телефон с simCardForSecondSlot : \n" + phone);
        System.out.println("\n");
        System.out.println("_______________________________________________________________________________");

        // Метод - одеть чехол
        System.out.println("\nМетод - одеть чехол : ");
        phoneService.caseOn(phone, myCase);
        System.out.println(phone);
        System.out.println("_______________________________________________________________________________");

        // Метод - снять чехол
        System.out.println("\nМетод - снять чехол: ");
        phoneService.caseOff(phone, myCase);
        System.out.println(phone);
        System.out.println("_______________________________________________________________________________");

        // Метод - получение смс на simCard
        System.out.println("\nМетод - получить смс на 1 симкарту : ");
        phoneService.receivedSms(phone, "Hello World!", 0);
        phoneService.receivedSms(phone, "Wie gehts dir?", 0);
        phoneService.receivedSms(phone, "We will Rock you!", 0);
        System.out.println("Мои смски на 1 симкарте : " + Arrays.toString(phone.getSimCard()[0].getSms()));
        System.out.println("_______________________________________________________________________________");

        System.out.println("\nМетод - получить смс на 2 симкарту : ");
        phoneService.receivedSms(phone, "Smoke on the water!", 1);
        phoneService.receivedSms(phone, "Road to hell!", 1);
        phoneService.receivedSms(phone, "In the black river!!", 1);
        System.out.println("Мои смски на 2 симкарте : " + Arrays.toString(phone.getSimCard()[1].getSms()));
        System.out.println("_______________________________________________________________________________");


        // Метод удаления смс из simCard
        System.out.println("\nМетод - удалить последнее  смс из 1 симкарты : ");
        System.out.println("Все сообщения " + Arrays.toString(phone.getSimCard()[0].getSms()));
        phoneService.deleteSmsMessageSim(phone, 2, 0);
        System.out.println("Сообщение которые остались после удаления последнего сообщения в 1 симке ..." + Arrays.toString(phone.getSimCard()[0].getSms()));
        System.out.println("Все сообщения " + Arrays.toString(phone.getSimCard()[1].getSms()));
        System.out.println("\nМетод - удалить первое  смс из 2 симкарты : ");
        phoneService.deleteSmsMessageSim(phone, 0, 1);
        System.out.println("Сообщение которые остались после удаления первого сообщения в 2 симке ..." + Arrays.toString(phone.getSimCard()[1].getSms()));
        System.out.println("_______________________________________________________________________________");

        //Метод - заполение всего массива сообщений simCard
        System.out.println("\nМетод - заполнить всю память в сим 1: ");
        phoneService.receivedSms(phone, "Day 1!", 0);
        phoneService.receivedSms(phone, "Day 10!", 0);
        phoneService.receivedSms(phone, "Day 100!", 0);
        phoneService.receivedSms(phone, "Day 1000!", 0);
        phoneService.receivedSms(phone, "Day 10000!", 0);
        phoneService.receivedSms(phone, "Day 100000!", 0);
        phoneService.receivedSms(phone, "Day 1000000!", 0);
        phoneService.receivedSms(phone, "Day 10000000!", 0);
        phoneService.receivedSms(phone, "Day 100000000!", 0);
        phoneService.receivedSms(phone, "Day 1000000000!", 0);
        System.out.println("Вся память 1 симкарты : " + Arrays.toString(phone.getSimCard()[0].getSms()));

        System.out.println("\nМетод - заполнить всю память в сим 2: ");
        phoneService.receivedSms(phone, "Way 1!", 1);
        phoneService.receivedSms(phone, "Way 10!", 1);
        phoneService.receivedSms(phone, "Way 100!", 1);
        phoneService.receivedSms(phone, "Way 1000!", 1);
        phoneService.receivedSms(phone, "Way 10000!", 1);
        phoneService.receivedSms(phone, "Way 100000!", 1);
        phoneService.receivedSms(phone, "Way 1000000!", 1);
        phoneService.receivedSms(phone, "Way 10000000!", 1);
        phoneService.receivedSms(phone, "Way 100000000!", 1);
        phoneService.receivedSms(phone, "Way 1000000000!", 1);
        System.out.println("Вся память 2 симкарты : " + Arrays.toString(phone.getSimCard()[1].getSms()));
        System.out.println("_______________________________________________________________________________");

        // Метод удаления массива смс из simCard
        System.out.println("\nМетод - удалить все смс из 1 симкарты : ");
        phoneService.deleteAllMessagesSim(phone, 0);
        System.out.println("Cообщения симкарты 1 после очистки" + Arrays.toString(phone.getSimCard()[0].getSms()));
        System.out.println("_______________________________________________________________________________");
        System.out.println("\nМетод - удалить все смс из 2 симкарты : ");
        phoneService.deleteAllMessagesSim(phone, 1);
        System.out.println("Cообщения симкарты 2 после очистки" + Arrays.toString(phone.getSimCard()[1].getSms()));
        System.out.println("_______________________________________________________________________________");

        // Метод - замена simCard с сохранением старого номера
        System.out.println("\nМетод - замена 1 симкарты на новую, с сохранением старого номера номера  simCard : ");
        SimCard changeSimOne = phoneService.changeSimCard(phone, simCard2, 0);
        System.out.println("\nСтарая 1 сим карта: " + changeSimOne);
        System.out.println("*Новая  сим карта  в первом слоте: " + phone);

        System.out.println("\nМетод - замена 2 симкарты на новую, с сохранением старого номера номера  simCard : ");
        SimCard changeSimCardTwo = phoneService.changeSimCard(phone, simCardForSecondSlot2, 1);
        System.out.println("\nСтарая 2 сим карта: " + changeSimCardTwo);
        System.out.println("*Новая  сим карта  во втором слоте: " + phone);
        System.out.println("_______________________________________________________________________________");

        // Метод удаления simCard
        System.out.println("\nМетод - удаление 1 simCard из телефона");
        SimCard removeSim1 = phoneService.removeSimCard(phone, 0);
        System.out.println("Телефон без 1 симкарты: ");
        System.out.println(phone);

        System.out.println("\nМетод - удаление 2 simCard из телефона");
        SimCard removeSim2 = phoneService.removeSimCard(phone, 1);
        System.out.println("Телефон без 2 сим карты => " + phone);
        System.out.println(phone);
        System.out.println("_______________________________________________________________________________");

    }
}
