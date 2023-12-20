package lesson_16_11_d_12_2023_phone.hometask_myphone_sim_2string;

public class Test {

    public static void main(String[] args) {

        PhoneService service = new PhoneService();
        Phone phone = new Phone(456, "m2");
        SimCard simCard = new SimCard(54);
        Cases cases = new Cases(54,"Rose", "Gold");

        // 1. Вставить симку
        boolean insertSimCardexpRes = true;
        boolean insertSimCardactRes = service.insertSimCard(phone, simCard);
        if (insertSimCardexpRes == insertSimCardactRes){System.out.println("Test is passed, sim in phone!");}
        else {System.out.println("Test  is failed!!!");}

        //2. удалить симку
        SimCard removeSimCardexpRes = phone.getSimCard();
        SimCard removeSimCardactRes = service.removeSimCard(phone);
        if (removeSimCardexpRes == removeSimCardactRes){System.out.println("Test is passed,sim is remove from phone!");}
        else {System.out.println("Test  is failed!!!");}

        // 3. Заменить симку с сохранением номера


        //4. Получить/принять смс
/*
        boolean receivedSmsexpRes = true;
        boolean receivedSmsactRes = service.receivedSms(phone, "Hallo");
        if (receivedSmsexpRes == receivedSmsactRes){System.out.println("Test is passed,you recived sms on your  phone!");}
        else {System.out.println("Test  is failed!!!");}*/


        // 7.Метод одеть чехол
        boolean caseOnexpRes = true;
        boolean caseOneactRes = service.caseOn(phone,cases);
        if (insertSimCardexpRes == insertSimCardactRes){System.out.println("Test is passed, phone has a case!");}
        else {System.out.println("Test  is failed!!!");}

        // 8. Метод снять чехол
        boolean caseOffexpRes = true;
        Cases caseOffactRes = service.caseOff(phone,cases);
        if (caseOffexpRes == caseOneactRes){System.out.println("Test is passed, phone is out of case!");}
        else {System.out.println("Test  is failed!!!");}




    }


}
