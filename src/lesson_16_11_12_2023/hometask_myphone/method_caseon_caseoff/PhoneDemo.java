package lesson_16_11_12_2023.hometask_myphone.method_caseon_caseoff;

public class PhoneDemo {

    public static void main(String[] args) {

        PhoneService phoneService = new PhoneService();
        Phone phone = new Phone(2443434, "Gert2");
        Phone phone2 = new Phone(7998, "Nec dF3");
        Cases myCase = new Cases(50, "Red", "Leather");
        Cases myCase2 = new Cases(20, "Black", "Titan");


        // Метод - одеть чехол
        System.out.println("\nМетод - одеть чехол 2 : ");
        phoneService.putTheCaseOn(phone,myCase);
        System.out.println(phone);

        // Метод - снять чехол
        System.out.println("\nМетод - снять чехол 2 : ");
        phoneService.takeOffCase(myCase2,phone);
        System.out.println(phone);


    }
}
