package example.app.phone;

public class App {

    public static void main(String[] args) {

        PhoneService service = new PhoneService();
        Phone phone1 = new Phone(38915, "x2");
        SimCard sim1 = new SimCard(11111);
        SimCard sim2 = new SimCard(22222);
        Case case1 = new Case(1,"Red", "Aluminium");

        // Метод - вставить simCard
        System.out.println("\nМетод - вставить simCard  в 1 слот: ");

        boolean inserted = service.insertSimCard(sim1,phone1,0);
        if (inserted) {
            System.out.println("Sim 1 inserted in => " + phone1);
        } else {
            System.out.println("Error !!! ");
        }

        // Метод - одеть чехол
        System.out.println("\nМетод - одеть чехол : ");
        service.caseOn(phone1,case1);
        System.out.println(phone1);

        // Метод - снять чехол
        System.out.println("\nМетод - снять чехол: ");
        service.caseOff(phone1,case1);
        System.out.println(phone1);

        // Метод - получение смс на simCard
        System.out.println("\nМетод - получить смс на 1 симкарту : ");

        service.recievedSms(phone1,"Hello moto!", 0);
        System.out.println(phone1);

        // Метод удаления смс из simCard
        System.out.println("\nМетод - удалить последнее  смс из 1 симкарты : ");
        service.deleteOneMessage(phone1,0,0);
        System.out.println(phone1);

        // Метод удаления simCard
        System.out.println("\nМетод - удаление 1 simCard из телефона");
        service.removeSimCard(phone1,0);
        System.out.println(phone1);


    }
}
