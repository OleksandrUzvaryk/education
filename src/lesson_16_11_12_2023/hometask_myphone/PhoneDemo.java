package lesson_16_11_12_2023.hometask_myphone;

import java.util.Arrays;

public class PhoneDemo {

    public static void main(String[] args) {

        PhoneService phoneService = new PhoneService();
        Phone phone = new Phone(2443434, "Gert2");
        Phone phone2 = new Phone(7998, "Nec dF3");
        SimCard simCard1 = new SimCard(111111111);
        SimCard simCard2 = new SimCard(33333333);
        SimCard simCardTwo1 = new SimCard(22222222);
        SimCard simCardTwo2 = new SimCard(444444444);
        Cases myCase = new Cases(50, "Red", "Leather");
        Cases myCase2 = new Cases(20, "Black", "Titan");


        System.out.println("\n");
        // Метод - вставить simCard
        System.out.println("Метод - вставить simCard : ");
        boolean inserted = phoneService.insertSimCard(phone, simCard1);
        if (inserted) {
            System.out.println("Sim 1 inserted in => " + phone);
        } else {
            System.out.println("Error !!! ");
        }
        System.out.println("\n");
        System.out.println("Телефон с 1 симкартой : \n" + phone);
        System.out.println("\n");
        // Метод - вставить simCardTwo
        System.out.println("Метод - вставить simCardTwo : ");
        boolean inserted2 = phoneService.insertSimCard2(phone,simCardTwo1);
        if (inserted2) {
            System.out.println("Sim 2 inserted in => " + phone);
        } else {
            System.out.println("Error !!! ");
        }
        System.out.println("\n");
        System.out.println("Телефон с 2 симкартой : \n" + phone);

        System.out.println("_______________________________________________________________________________");


        // Метод - получение смс на simCard
        System.out.println("\nМетод - получить смс на 1 симкарту : ");
        phoneService.receivedSms(phone, "Hello World!");
        phoneService.receivedSms(phone, "Wie gehts dir?");
        phoneService.receivedSms(phone, "We will Rock you!");
        System.out.println("Мои смски на 1 симкарте : " + Arrays.toString(phone.getSimCard().getSms()));
        // Метод - получение смс на simCardTwo
        System.out.println("\nМетод - получить смс на 2 симкарту : ");
        phoneService.receivedSms2(phone,"Ich liebe Koln!");
        phoneService.receivedSms2(phone,"Today is cold!");
        phoneService.receivedSms2(phone,"I need more time!");
        System.out.println("Мои смски на 2 симкарте : " + Arrays.toString(phone.getSimCardTwo().getSms()));

        System.out.println("_______________________________________________________________________________");


       // Метод удаления смс из simCard
        System.out.println("\nМетод - удалить последнее  смс из 1 симкарты : ");
        System.out.println("Все сообщения " + Arrays.toString(phone.getSimCard().getSms()));
        phoneService.deleteSmsMessageSim1(phone,2);
        System.out.println("Сообщение которые остались после удаления последнего сообщения в 1 симке ..." + Arrays.toString(phone.getSimCard().getSms()));
        // Метод удаления смс из simCardTwo
        System.out.println("\nМетод - удалить первое  смс из 2 симкарты : ");
        System.out.println("Все сообщения " + Arrays.toString(phone.getSimCardTwo().getSms()));
        phoneService.deleteSmsMessageSim2(phone,0);
        System.out.println("Сообщение которые остались после удаления первого сообщения во 2 симке ..." + Arrays.toString(phone.getSimCardTwo().getSms()));

        System.out.println("_______________________________________________________________________________");

        // Метод - заполение всего массива сообщений simCard
        System.out.println("\nМетод - заполнить всю память в сим 1: ");
        phoneService.receivedSms(phone, "Day 1!");
        phoneService.receivedSms(phone, "Day 10!");
        phoneService.receivedSms(phone, "Day 100!");
        phoneService.receivedSms(phone, "Day 1000!");
        phoneService.receivedSms(phone, "Day 10000!");
        phoneService.receivedSms(phone, "Day 100000!");
        phoneService.receivedSms(phone, "Day 1000000!");
        phoneService.receivedSms(phone, "Day 10000000!");
        phoneService.receivedSms(phone, "Day 100000000!");
        phoneService.receivedSms(phone, "Day 1000000000!");
        System.out.println("Вся память 1 симкарты : " + Arrays.toString(phone.getSimCard().getSms()));

        // Метод - заполение всего массива сообщений simCardTwo
        System.out.println("\nМетод - заполнить всю память в сим 2: ");
        phoneService.receivedSms2(phone,"Car 1");
        phoneService.receivedSms2(phone,"Car 2");
        phoneService.receivedSms2(phone,"Car 3");
        phoneService.receivedSms2(phone,"Car 4");
        phoneService.receivedSms2(phone,"Car 5");
        phoneService.receivedSms2(phone,"Car 6");
        phoneService.receivedSms2(phone,"Car 7");
        phoneService.receivedSms2(phone,"Car 8");
        phoneService.receivedSms2(phone,"Car 9");
        phoneService.receivedSms2(phone,"Car 10");
        System.out.println("\nВся память 1 симкарты : " + Arrays.toString(phone.getSimCardTwo().getSms()));


        System.out.println("_______________________________________________________________________________");

        // Метод удаления массива смс из simCard
        System.out.println("\nМетод - удалить все смс из 1 симкарты : ");
        phoneService.deleteAllMessagesSim1(phone);
        System.out.println("Cообщения симкарты 1 после очистки" + Arrays.toString(phone.getSimCard().getSms()));

        // Метод удаления массива смс из simCardTwo
        System.out.println("\nМетод - удалить все смс из 2 симкарты : ");
        phoneService.deleteAllMessagesSim2(phone);
        System.out.println("Cообщения симкарты 1 после очистки" +Arrays.toString(phone.getSimCardTwo().getSms()));

        System.out.println("_______________________________________________________________________________");


        // Метод - замена simCard с сохранением старого номера
        System.out.println("\nМетод - замена 1 симкарты на новую, с сохранением старого номера номера  simCard : ");
        SimCard changeSim1 = phoneService.changeSimCard(phone,simCard2);
        System.out.println("\nСтарая 1 сим карта: " + changeSim1);
        System.out.println("Новая 1 сим карта: " + phone);

        // Метод - замена simCardTwo с сохранением старого номера
        System.out.println("\nМетод - замена 2 симкарты на новую, с сохранением старого номера номера  simCardTwo : ");
        SimCard changeSim2 = phoneService.changeSimCard2(phone,simCardTwo2);
        System.out.println("\nСтарая 2 сим карта: " + changeSim1);
        System.out.println("Новая 2 сим карта: " + phone);
        System.out.println("_______________________________________________________________________________");

        // Метод удаления simCard
        System.out.println("\nМетод - удаление simCard из телефона");
        SimCard removeSim1 = phoneService.removeSimCard(phone);
        System.out.println("Телефон без 1 симкарты: ");
        System.out.println(phone);
        System.out.println("\n");

        // Метод удаления ssimCardTwo
        System.out.println("Метод - удаление simCardTwo из телефона");
        SimCard removeSim2 = phoneService.removeSimCard2(phone);
        System.out.println("Телефон без 2 симкарты: ");
        System.out.println(phone);


    }
}
